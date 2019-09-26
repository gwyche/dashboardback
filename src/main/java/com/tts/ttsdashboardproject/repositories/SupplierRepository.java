package com.tts.ttsdashboardproject.repositories;

import com.tts.ttsdashboardproject.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
