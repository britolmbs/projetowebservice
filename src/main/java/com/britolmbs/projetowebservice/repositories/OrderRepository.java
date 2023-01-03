package com.britolmbs.projetowebservice.repositories;

import com.britolmbs.projetowebservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
