package com.britolmbs.projetowebservice.repositories;

import com.britolmbs.projetowebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
