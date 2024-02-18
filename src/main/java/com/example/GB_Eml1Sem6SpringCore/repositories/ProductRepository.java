package com.example.GB_Eml1Sem6SpringCore.repositories;

import com.example.GB_Eml1Sem6SpringCore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
