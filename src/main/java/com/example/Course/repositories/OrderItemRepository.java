package com.example.Course.repositories;

import com.example.Course.model.entities.OrderItem;
import com.example.Course.model.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
