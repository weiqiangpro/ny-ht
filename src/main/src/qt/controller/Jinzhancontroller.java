package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Chanchu;
import qt.bean.Jinzhan;
import qt.bean.Msg;
import qt.service.ChanchuService;
import qt.service.JinzhanService;


@RestController
@CrossOrigin
@RequestMapping("jinzhan")
public class Jinzhancontroller {
    @Autowired
    private JinzhanService jinzhanService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",jinzhanService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",jinzhanService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Jinzhan jinzhan) {
        jinzhanService.upadata(jinzhan);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Jinzhan jinzhan) {
        jinzhanService.save(jinzhan);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Jinzhan jinzhan){
        jinzhanService.delete(jinzhan);
        return  Msg.success();
    }


}
