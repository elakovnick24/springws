package guru.qa.springws.controller;

import guru.qa.springws.domain.User;
import guru.qa.springws.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/internal")
public class MainController {

    private IUserService us;

    @Autowired
    public MainController(IUserService us) {
        this.us = us;
    }

    @GetMapping("/user")
    public User getDefaultUser() {
        return us.getUser();
    }

}
