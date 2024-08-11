package com.purplehaze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purplehaze.course.entities.OrderItem;
import com.purplehaze.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
