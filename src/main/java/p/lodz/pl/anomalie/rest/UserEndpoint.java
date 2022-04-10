package p.lodz.pl.anomalie.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import p.lodz.pl.anomalie.entity.User;
import p.lodz.pl.anomalie.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserEndpoint {

    UserRepository repository;

    @Autowired
    public UserEndpoint(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return repository.findAll();
    }
}
