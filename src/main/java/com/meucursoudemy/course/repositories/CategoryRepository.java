package com.meucursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meucursoudemy.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
