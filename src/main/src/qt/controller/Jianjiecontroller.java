package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Guandian;
import qt.bean.Jianjie;
import qt.bean.Msg;
import qt.service.*;


@RestController
@CrossOrigin
@RequestMapping("jianjie")
public class Jianjiecontroller {

    @Autowired
    private JianjieService jianjieService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",jianjieService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){
        Msg msg = Msg.success();
        msg = msg.add("mes",jianjieService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Jianjie jianjie) {
        jianjieService.upadata(jianjie);
        return Msg.success();
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Jianjie jianjie) {
        jianjieService.save(jianjie);
        return Msg.success();
    }
    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Jianjie jianjie){
        jianjieService.delete(jianjie);
        return  Msg.success();
    }
}
