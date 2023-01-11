package com.britolmbs.projetowebservice.repositories;

import com.britolmbs.projetowebservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
}
