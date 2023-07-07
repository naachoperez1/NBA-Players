package com.example.springbootapirest;

import com.example.springbootapirest.entities.Player;
import com.example.springbootapirest.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApiRestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootApiRestApplication.class, args);
        PlayerRepository repository = context.getBean(PlayerRepository.class);

        // CRUD
        // Crear Laptop
        Player player1 = new Player(null, "LeBron", "James", 38, "Los Angeles Lakers");
        Player player2 = new Player(null, "Stephen", "Curry", 35, "Golden State Warriors");
        Player player3 = new Player(null, "Kevin", "Durant", 35, "Phoenix Suns");

        // Guardar una laptop
        repository.save(player1);
        repository.save(player2);
        repository.save(player3);

        // Recuperar todas las laptop
//        System.out.println(repository.findAll());

        // Borrar una laptop
//        repository.delete(laptop3);

    }

}
