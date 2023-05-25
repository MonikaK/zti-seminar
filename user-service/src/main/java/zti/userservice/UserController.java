package zti.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zti.userservice.model.User;
import zti.userservice.model.UsersService;

import java.util.List;

@RestController
@RequestMapping("/user-service")
@Slf4j
public class UserController {

    @Autowired
    UsersService usersService;

    @Value("${subjectName}")
    private String subject;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from UserService";
    }

    @GetMapping("/info")
    public String info() {
        return subject + " - UserService";
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return usersService.getUsersList();
    }
}