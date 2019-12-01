package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Jiagou;
import qt.bean.Msg;
import qt.bean.Xinwen;
import qt.service.JiagouService;
import qt.service.XinwenService;


@RestController
@CrossOrigin
@RequestMapping("jiagou")
public class Jiagoucontroller {
    @Autowired
    private JiagouService jiagouService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",jiagouService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",jiagouService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Jiagou jiagou) {
        jiagouService.upadata(jiagou);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Jiagou jiagou) {
        jiagouService.save(jiagou);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Jiagou jiagou){
        jiagouService.delete(jiagou);
        return  Msg.success();
    }


}
