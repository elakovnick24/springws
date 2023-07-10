package guru.qa.springws.service;

import guru.qa.springws.domain.User;
import guru.qa.springws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements IUserService {

    private final UserRepository ur;

    @Autowired
    public UserService(UserRepository ur) {
        this.ur = ur;
    }

    public User getUser() {
        User usr = new User();
        usr.setUsername("dima");
        usr.setDate(new Date());
        return usr;
    }
}
