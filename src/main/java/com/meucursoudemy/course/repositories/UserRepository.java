package com.meucursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meucursoudemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
