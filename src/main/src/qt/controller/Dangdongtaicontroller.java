package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Dangdongtai;
import qt.bean.Msg;
import qt.service.DangdongtaiService;


@RestController
@CrossOrigin
@RequestMapping("dangdongtai")
public class Dangdongtaicontroller {
    @Autowired
    private DangdongtaiService dangdongtaiService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id ){
        return Msg.success().add("mes",dangdongtaiService.get(id));
    }
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Msg all(){

        Msg msg = Msg.success();
        msg = msg.add("mes",dangdongtaiService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Dangdongtai dangdongtai) {
        dangdongtaiService.upadata(dangdongtai);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Dangdongtai dangdongtai) {
        dangdongtaiService.save(dangdongtai);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}",method = RequestMethod.DELETE)
    public Msg de(Dangdongtai dangdongtai){
        dangdongtaiService.delete(dangdongtai);
        return  Msg.success();
    }


}
