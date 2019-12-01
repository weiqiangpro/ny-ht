package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Fagui;
import qt.bean.Msg;
import qt.service.DongtaiService;
import qt.service.FaguiService;


@RestController
@CrossOrigin
@RequestMapping("fagui")
public class Faguicontroller {
    @Autowired
    private FaguiService faguiService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",faguiService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",faguiService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}",method = RequestMethod.PUT)
    public Msg up(Fagui fagui){
        faguiService.upadata(fagui);
        return  Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Fagui fagui) {
        faguiService.save(fagui);
        return Msg.success();
    }
    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Fagui fagui){
        faguiService.delete(fagui);
        return  Msg.success();
    }


}
