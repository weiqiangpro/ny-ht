package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Dongtai;
import qt.bean.Gonggao;
import qt.bean.Msg;
import qt.service.DongtaiService;
import qt.service.JianjieService;


@RestController
@CrossOrigin
@RequestMapping("dongtai")
public class Dongtaicontroller {
    @Autowired
    private DongtaiService dongtaiService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",dongtaiService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",dongtaiService.getall());
        return msg;
    }
    @RequestMapping(value = "up/{id}",method = RequestMethod.PUT)
    public Msg up(Dongtai dongtai){
        dongtaiService.upadata(dongtai);
        return  Msg.success();
    }
    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Dongtai dongtai){
        dongtaiService.delete(dongtai);
        return  Msg.success();
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Dongtai dongtai) {
        dongtaiService.save(dongtai);
        return Msg.success();
    }


}
