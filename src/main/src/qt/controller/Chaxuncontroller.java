package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Baodao;
import qt.bean.Chanchu;
import qt.bean.Chaxun;
import qt.bean.Msg;
import qt.service.BaodaoService;
import qt.service.ChanchuService;
import qt.service.ChaxunService;


@RestController
@CrossOrigin
@RequestMapping("chaxun")
public class Chaxuncontroller {
    @Autowired
    private ChaxunService chaxunServicec;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",chaxunServicec.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",chaxunServicec.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Chaxun chaxun) {
        chaxunServicec.upadata(chaxun);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Chaxun chaxun) {
        chaxunServicec.save(chaxun);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Chaxun chaxun){
        chaxunServicec.delete(chaxun);
        return  Msg.success();
    }


}
