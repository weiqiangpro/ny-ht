package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Dijianjie;
import qt.bean.Msg;
import qt.service.DijianjieService;


@RestController
@CrossOrigin
@RequestMapping("dijianjie")
public class Dijianjiecontroller {

    @Autowired
    private DijianjieService dijianjieService;


    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){
        Msg msg = Msg.success();
        msg = msg.add("mes",dijianjieService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Dijianjie dijianjie) {
        dijianjieService.upadata(dijianjie);
        return Msg.success();
    }

}
