package guru.qa.springws.service;

import guru.qa.springws.domain.User;
import guru.qa.springws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    private final UserRepository ur;

    @Autowired
    public UserService(UserRepository ur) {
        this.ur = ur;
    }

    public User getUser() {
        return User.formUserEntity(ur.findByUsername("dima"));
    }
}
