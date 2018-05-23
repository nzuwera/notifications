package rw.rolp.notifications.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;

@Controller
@RequestMapping(value = "/notifications")
public class NotificationController {
    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(@RequestParam(value = "emailAddress",required = false) String emailAddress, Model model) {
        if(null != emailAddress){

        }
        return "Notifications";
    }
}
