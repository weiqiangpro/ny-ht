package qt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qt.bean.Jiagou;
import qt.bean.Jidi;
import qt.bean.Msg;
import qt.service.JiagouService;
import qt.service.JidiService;


@RestController
@CrossOrigin
@RequestMapping("jidi")
public class jidicontroller {
    @Autowired
    private JidiService jidiService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Msg all(@PathVariable("id") int id) {
        return Msg.success().add("mes", jidiService.get(id));
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Msg all() {

        Msg msg = Msg.success();
        msg = msg.add("mes", jidiService.getall());
        return msg;
    }

    @RequestMapping(value = "up/{id}", method = RequestMethod.PUT)
    public Msg up(Jidi jidi) {
        jidiService.upadata(jidi);
        return Msg.success();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Msg add(Jidi jidi) {
        jidiService.save(jidi);
        return Msg.success();
    }

    @RequestMapping(value = "de/{id}", method = RequestMethod.DELETE)
    public Msg de(Jidi jidi) {
        jidiService.delete(jidi);
        return Msg.success();
    }


}
