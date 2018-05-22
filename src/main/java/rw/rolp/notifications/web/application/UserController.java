package rw.rolp.notifications.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/showUsers")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String getUsers() {
        return "Users";
    }
}
