package p.lodz.pl.anomalie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import p.lodz.pl.anomalie.entity.User;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();
}
