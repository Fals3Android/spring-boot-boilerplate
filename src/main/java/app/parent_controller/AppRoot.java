package app.parent_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRoot {

    @RequestMapping(value =  "/", method = RequestMethod.GET)
    public String render() {
        return "Hello World!";
    }
}
