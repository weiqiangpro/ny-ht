package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Chanchu;
import qt.bean.Msg;
import qt.bean.Tuandui;
import qt.service.ChanchuService;
import qt.service.TuanduiService;


@RestController
@CrossOrigin
@RequestMapping("chanchu")
public class Chanchucontroller {
    @Autowired
    private ChanchuService chanchuService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",chanchuService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",chanchuService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Chanchu chanchu) {
        chanchuService.upadata(chanchu);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Chanchu chanchu) {
        chanchuService.save(chanchu);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Chanchu chanchu){
        chanchuService.delete(chanchu);
        return  Msg.success();
    }


}
