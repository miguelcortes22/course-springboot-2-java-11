package com.meucursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meucursoudemy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
