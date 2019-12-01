package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import qt.bean.Msg;
import qt.bean.Sy;
import qt.service.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;


@RestController
@CrossOrigin
public class Allcontroller {
    @Autowired
    private SyService syService;
    @Autowired
    private KeyanService keyanService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("sy",syService.getall());
        msg = msg.add("keyan",keyanService.getall());
        return msg;
    }

    @RequestMapping(value = "upfile1/{id}",method = RequestMethod.POST)
    public String up1(@RequestParam("file") MultipartFile file,@PathVariable("id") Integer id)
    {
        System.out.println(id);
        File fie = new File("./webapps/ht/pho/lunbo","lb"+(id+1)+".png");
        try {
            file.transferTo(fie);
        } catch (IOException e) {
            return e.toString();
        }
        return "success";
    }

    @RequestMapping(value = "upfile2/{id}",method = RequestMethod.POST)
    public String up2(@RequestParam("file") MultipartFile file,@PathVariable("id") Integer id)
    {
        System.out.println(id);
        File fie = new File("./webapps/ht/pho/keyan","ky"+(id+1)+".png");
        try {
            file.transferTo(fie);
        } catch (IOException e) {
            return e.toString();
        }
        return "success";
    }

    @RequestMapping(value = "upfile",method = RequestMethod.POST)
    public String up(@RequestParam("file") MultipartFile file)
    {
        String name = String.valueOf(new Date().getTime())+".png";
        File fie = new File("./webapps/ht/pic",name);
//        File fie = new File("/log",name);
        try {
            file.transferTo(fie);
        } catch (IOException e) {
            return e.toString();
        }
        return "ht/pic/"+name;
    }

    @RequestMapping(value = "upfilejd/{id}",method = RequestMethod.POST)
    public String up(@RequestParam("file") MultipartFile file,@PathVariable("id")int id)
    {
        String name = "jidi"+id+".png";
        File fie = new File("./webapps/ht/pho/jidi",name);
//        File fie = new File("/log",name);
        try {
            file.transferTo(fie);
        } catch (IOException e) {
            return e.toString();
        }
        return "success";
    }


}