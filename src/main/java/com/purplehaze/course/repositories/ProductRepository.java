package com.purplehaze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purplehaze.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
