package com.britolmbs.projetowebservice.repositories;

import com.britolmbs.projetowebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
