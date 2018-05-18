package rw.rolp.notifications.webservices;

import rw.rolp.notifications.entity.Users;
import rw.rolp.notifications.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    List<Users> findAll(@RequestParam(required = false) String emailAddress) {
        List<Users> users = new ArrayList<>();
        if (null == emailAddress) {
            Iterable<Users> results = this.repository.findAll();
            results.forEach(user -> {
                users.add(user);
            });
        } else {
            Users user = this.repository.getByEmailAddress(emailAddress);
            if (null != user) {
                users.add(user);
            }
        }
        return users;
    }

}
