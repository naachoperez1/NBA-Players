package com.example.springbootapirest.controllers;

import com.example.springbootapirest.entities.Laptop;
import com.example.springbootapirest.repository.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    LaptopRepository laptopRepository;
    private final Logger log =  LoggerFactory.getLogger(LaptopController.class);

    public LaptopController(LaptopRepository repository){
        this.laptopRepository = repository;
    }


    /**
     * Devolver todos las laptop en la base de datos.
     */
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }


    /**
     * Devolver una laptop por su id.
     */
    @GetMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> findByID(@PathVariable  Long id){
        Optional<Laptop> laptopOptional = laptopRepository.findById(id);

        if (laptopOptional.isPresent()){
            return ResponseEntity.ok(laptopOptional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * Insertar una laptop en base de datos.
     */
    @PostMapping("api/laptops")
    public Laptop save(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }


    /**
     * Modificar una laptop existente en base de datos.
     */
    @PutMapping("api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if (laptop.getId() == null){
            log.warn("Trying to update a non-existent laptop");
            return ResponseEntity.badRequest().build();
        }
        if (!laptopRepository.existsById(laptop.getId())){
            log.warn("Trying to update a non-existent laptop");
            return ResponseEntity.notFound().build();
        }
        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }


    /**
     * Borrar una laptop de la base de datos.
     */
    @DeleteMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



    /**
     * Borrar todas las laptop de la base de datos.
     */
    @DeleteMapping("api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }


}
