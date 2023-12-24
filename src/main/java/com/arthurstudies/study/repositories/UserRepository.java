package com.arthurstudies.study.repositories;

import com.arthurstudies.study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
