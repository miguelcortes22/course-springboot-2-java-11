package com.meucursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meucursoudemy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
