package com.mlhoste.magicpony.repository;

import com.mlhoste.magicpony.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLogin(String login);
}
