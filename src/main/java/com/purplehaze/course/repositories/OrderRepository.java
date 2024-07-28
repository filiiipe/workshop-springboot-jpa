package com.purplehaze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purplehaze.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
