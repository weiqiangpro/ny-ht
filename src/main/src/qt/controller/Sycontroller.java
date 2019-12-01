package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Msg;
import qt.bean.Sy;
import qt.service.SyService;


@RestController
@CrossOrigin
@RequestMapping("sy")
public class Sycontroller {
    @Autowired
    private SyService syService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",syService.get(id));
    }
    @RequestMapping(value = "up/{id}",method = RequestMethod.PUT)
    public Msg all(Sy sy){
        syService.updata(sy);
        return  Msg.success();
    }

}
