package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Gonggao;
import qt.bean.Guandian;
import qt.bean.Msg;
import qt.service.DongtaiService;
import qt.service.GuandianService;


@RestController
@CrossOrigin
@RequestMapping("guandian")
public class Guandiancontroller {
    @Autowired
    private GuandianService guandianService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",guandianService.get(id));
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Msg all() {

        Msg msg = Msg.success();
        msg = msg.add("mes", guandianService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Guandian guandian) {
        guandianService.upadata(guandian);
        return Msg.success();
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Guandian guandian) {
        guandianService.save(guandian);
        return Msg.success();
    }
    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Guandian guandian){
        guandianService.delete(guandian);
        return  Msg.success();
    }
}
