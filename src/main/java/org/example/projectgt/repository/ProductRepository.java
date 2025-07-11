package org.example.projectgt.repository;

import org.example.projectgt.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    boolean existsByName(String name);
    Page<Product> findAll(Pageable pageable);
}
