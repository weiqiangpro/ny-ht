package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Jiedu;
import qt.bean.Msg;
import qt.service.DongtaiService;
import qt.service.JieduService;


@RestController
@CrossOrigin
@RequestMapping("jiedu")
public class Jieducontroller {
    @Autowired
    private JieduService jieduService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",jieduService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",jieduService.getall());
        return msg;
    }
    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Jiedu jiedu) {
        jieduService.upadata(jiedu);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Jiedu jiedu) {
        jieduService.save(jiedu);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Jiedu jiedu){
        jieduService.delete(jiedu);
        return  Msg.success();
    }


}
