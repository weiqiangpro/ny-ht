package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Admin;
import qt.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {


    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/tologin")
    public Map aaa(HttpServletRequest res, @RequestParam(value = "user") String user, @RequestParam(value = "passwd") String passwd) {

        HttpSession session = res.getSession();
        Admin admin = new Admin();
        admin.setUname(user);
        admin.setUpasswd(passwd);
        admin.setUsessionid(session.getId());

        String pass = adminService.get(user).getUpasswd();
        Map<String, String> map = new HashMap<String, String>();
        if (pass.equals(passwd)){
            session.setAttribute("admin", admin.getUname());
            adminService.update(admin);

            String basePath = res.getScheme() + "://" + res.getServerName() + ":" + res.getServerPort()
                    + res.getContextPath();
            System.out.println(basePath);
            map.put("url", basePath);
            map.put("flag", "success");
        }else {
            map.put("flag","fail");
        }

        return map;

    }


    @RequestMapping("/get")
    @ResponseBody
    public Map<String, String> get(HttpServletRequest res) {

        Map<String,String> map = new HashMap<String, String>();
        String name = (String) res.getSession().getAttribute("admin");
        map.put("login","logined");
        map.put("name",adminService.get(name).getUsername());
        return map;
    }


    @RequestMapping("/exit")
    @ResponseBody
    public String exit(HttpServletRequest res) {
        HttpSession session = res.getSession();
        session.removeAttribute("admin");
        return "success";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(HttpServletRequest res, @RequestParam("upasswd") String upasswd, @RequestParam("upasswd1") String upasswd1, @RequestParam("upasswd2") String upasswd2,@RequestParam("uname")String uname ) {

        String name = (String) res.getSession().getAttribute("admin");
        Admin admin = adminService.get(name);
        if (!upasswd1.equals(upasswd2)){
            return "noequals";
        }
        if (!admin.getUpasswd().equals(upasswd)) {
         return "wrong";
        }
        Admin admin1 = new Admin();
        admin.setUname(name);
        admin.setUpasswd(upasswd1);
        adminService.update(admin1);
        res.getSession().removeAttribute("admin");
        return "success";

    }

}
