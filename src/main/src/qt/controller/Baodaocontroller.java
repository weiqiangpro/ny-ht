package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Baodao;
import qt.bean.Jiagou;
import qt.bean.Msg;
import qt.service.BaodaoService;
import qt.service.JiagouService;


@RestController
@CrossOrigin
@RequestMapping("baodao")
public class Baodaocontroller {
    @Autowired
    private BaodaoService baodaoService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",baodaoService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",baodaoService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Baodao baodao) {
        baodaoService.upadata(baodao);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Baodao baodao) {
        baodaoService.save(baodao);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Baodao baodao){
        baodaoService.delete(baodao);
        return  Msg.success();
    }


}
