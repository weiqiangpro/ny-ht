package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Chengguo;
import qt.bean.Hezuo;
import qt.bean.Msg;
import qt.service.ChengguoService;
import qt.service.HezuoService;


@RestController
@CrossOrigin
@RequestMapping("hezuo")
public class Hezuocontroller {
    @Autowired
    private HezuoService hezuoService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",hezuoService.get(id));
    }

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",hezuoService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Hezuo hezuo) {
        hezuoService.upadata(hezuo);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Hezuo hezuo) {
        hezuoService.save(hezuo);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Hezuo hezuo){
        hezuoService.delete(hezuo);
        return  Msg.success();
    }


}
