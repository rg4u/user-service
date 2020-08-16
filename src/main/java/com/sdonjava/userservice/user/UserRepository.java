package com.sdonjava.userservice.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    //TODO getUserBySurName()
    List<User> findBySurNameIgnoreCase(String surname);

    //TODO getUserById()
    User findById(long id);


}
