package com.britolmbs.projetowebservice.repositories;

import com.britolmbs.projetowebservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
