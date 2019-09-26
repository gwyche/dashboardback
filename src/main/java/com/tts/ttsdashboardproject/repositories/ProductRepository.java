package com.tts.ttsdashboardproject.repositories;

import com.tts.ttsdashboardproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
