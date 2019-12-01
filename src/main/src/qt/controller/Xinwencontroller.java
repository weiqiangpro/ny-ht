package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Jiedu;
import qt.bean.Msg;
import qt.bean.Xinwen;
import qt.service.XinwenService;


@RestController
@CrossOrigin
@RequestMapping("xinwen")
public class Xinwencontroller {
    @Autowired
    private XinwenService xinwenService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",xinwenService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",xinwenService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Xinwen xinwen) {
        xinwenService.upadata(xinwen);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Xinwen xinwen) {
        xinwenService.save(xinwen);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Xinwen xinwen){
        xinwenService.delete(xinwen);
        return  Msg.success();
    }


}
