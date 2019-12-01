package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Gonggao;
import qt.bean.Msg;
import qt.dao.GonggaoMapper;
import qt.service.GonggaoService;
import qt.service.JianjieService;


@RestController
@CrossOrigin
@RequestMapping("gonggao")
public class Gonggaocontroller {
    @Autowired
    private GonggaoService gonggaoService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",gonggaoService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){
        Msg msg = Msg.success();
        msg = msg.add("mes",gonggaoService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}",method = RequestMethod.PUT)
    public Msg up(Gonggao gonggao){
        gonggaoService.upadata(gonggao);
        return  Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Gonggao gonggao) {
        gonggaoService.save(gonggao);
        return Msg.success();
    }
    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Gonggao gonggao){
        gonggaoService.delete(gonggao);
        return  Msg.success();
    }

}
