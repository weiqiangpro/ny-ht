package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qt.bean.Keyan;
import qt.bean.Msg;
import qt.bean.Sy;
import qt.service.KeyanService;
import qt.service.SyService;



@RestController
@CrossOrigin
@RequestMapping("keyan")
public class Keyancontroller {
    @Autowired
    private KeyanService keyanService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",keyanService.get(id));
    }
    @RequestMapping(value = "up/{id}",method = RequestMethod.PUT)
    public Msg all(Keyan keyan){
        keyanService.updata(keyan);
        return  Msg.success();
    }

}
