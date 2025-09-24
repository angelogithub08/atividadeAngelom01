package com.example.crud.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findAllByActiveTrue();

    List<Product> findAllByCategoryAndActiveTrue(String category);

    Optional<Product> findByIdAndActiveTrue(String id);

    Object findAllByCategory(String categoryAsParam);
}
