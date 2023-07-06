package com.example.springbootapirest;

import com.example.springbootapirest.entities.Laptop;
import com.example.springbootapirest.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootApiRestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootApiRestApplication.class, args);
        LaptopRepository repository = context.getBean(LaptopRepository.class);

        // CRUD
        // Crear Laptop
        Laptop laptop1 = new Laptop(null, "VivoBook", "ASUS", 280.50);
        Laptop laptop2 = new Laptop(null, "RESTFull Notebook", "ASUS", 210.50);
        Laptop laptop3 = new Laptop(null, "Mac Pro 12", "Apple", 280.50);

        // Guardar una laptop
        repository.save(laptop1);
        repository.save(laptop2);
        repository.save(laptop3);

        // Recuperar todas las laptop
        System.out.println(repository.findAll());

        // Borrar una laptop
//        repository.delete(laptop3);

    }

}
