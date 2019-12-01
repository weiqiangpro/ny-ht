package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Baodao;
import qt.bean.Msg;
import qt.bean.Tuandui;
import qt.service.BaodaoService;
import qt.service.TuanduiService;


@RestController
@CrossOrigin
@RequestMapping("tuandui")
public class Tuanduicontroller {
    @Autowired
    private TuanduiService tuanduiService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",tuanduiService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",tuanduiService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Tuandui tuandui) {
        tuanduiService.upadata(tuandui);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Tuandui tuandui) {
        tuanduiService.save(tuandui);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Tuandui tuandui){
        tuanduiService.delete(tuandui);
        return  Msg.success();
    }


}
