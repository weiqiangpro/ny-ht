package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Chaxun;
import qt.bean.Msg;
import qt.bean.Wenhua;
import qt.service.ChaxunService;
import qt.service.WenhuaService;


@RestController
@CrossOrigin
@RequestMapping("wenhua")
public class Wenhuacontroller {
    @Autowired
    private WenhuaService wenhuaService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",wenhuaService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",wenhuaService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Wenhua wenhua) {
        wenhuaService.upadata(wenhua);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Wenhua wenhua) {
        wenhuaService.save(wenhua);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Wenhua wenhua){
        wenhuaService.delete(wenhua);
        return  Msg.success();
    }


}
