package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Baodao;
import qt.bean.Msg;
import qt.bean.Zixun;
import qt.service.BaodaoService;
import qt.service.ZixunService;


@RestController
@CrossOrigin
@RequestMapping("zixun")
public class Zixuncontroller {
    @Autowired
    private ZixunService zixunService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",zixunService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){
        Msg msg = Msg.success();
        msg = msg.add("mes",zixunService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Zixun zixun) {
        zixunService.upadata(zixun);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Zixun zixun) {
        zixunService.save(zixun);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Zixun zixun){
        zixunService.delete(zixun);
        return  Msg.success();
    }


}
