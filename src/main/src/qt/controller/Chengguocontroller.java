package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Chengguo;
import qt.bean.Jinzhan;
import qt.bean.Msg;
import qt.service.ChengguoService;
import qt.service.JinzhanService;


@RestController
@CrossOrigin
@RequestMapping("chengguo")
public class Chengguocontroller {
    @Autowired
    private ChengguoService chengguoService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",chengguoService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",chengguoService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Chengguo chengguo) {
        chengguoService.upadata(chengguo);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Chengguo chengguo) {
        chengguoService.save(chengguo);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Chengguo chengguo){
        chengguoService.delete(chengguo);
        return  Msg.success();
    }


}
