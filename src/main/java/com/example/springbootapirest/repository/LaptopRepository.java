package com.example.springbootapirest.repository;

import com.example.springbootapirest.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository <Laptop,Long>{
}
