package qt.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import qt.bean.Admin;
import qt.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginInterceptor implements HandlerInterceptor {



    @Autowired
    private AdminService adminService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = request.getSession();
        String uname = (String) session.getAttribute("admin");
        String sessionid = session.getId();
        String url = request.getRequestURI();
        if(uname!=null) {
            Admin admin = null;
            if (adminService!=null){
                admin= adminService.get(uname);
            }
            if (admin != null)
            {

                if (sessionid.equals(admin.getUsessionid())){
                    return true;
                }
                else{
                    response.getWriter().write("relogin");
                    return false;
                }
            }

        }

        response.getWriter().write("fail");
        return false;

    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
