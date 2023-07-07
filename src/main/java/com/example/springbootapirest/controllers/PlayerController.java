package com.example.springbootapirest.controllers;

import com.example.springbootapirest.entities.Player;
import com.example.springbootapirest.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {
    PlayerRepository playerRepository;
    private final Logger log =  LoggerFactory.getLogger(PlayerController.class);

    public PlayerController(PlayerRepository repository){
        this.playerRepository = repository;
    }


    /**
     * Devolver todos los jugadores en la base de datos.
     */
    @GetMapping("/api/players")
    public List<Player> findAll(){
        return playerRepository.findAll();
    }


    /**
     * Devolver un jugador por su id.
     */
    @GetMapping("api/players/{id}")
    public ResponseEntity<Player> findByID(@PathVariable  Long id){
        Optional<Player> playerOptional = playerRepository.findById(id);

        if (playerOptional.isPresent()){
            return ResponseEntity.ok(playerOptional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * Insertar un jugador en base de datos.
     */
    @PostMapping("api/players")
    public Player save(@RequestBody Player player){
        return playerRepository.save(player);
    }


    /**
     * Modificar un jugador existente en base de datos.
     */
    @PutMapping("api/players")
    public ResponseEntity<Player> update(@RequestBody Player player){
        if (player.getId() == null){
            log.warn("Trying to update a non-existent player");
            return ResponseEntity.badRequest().build();
        }
        if (!playerRepository.existsById(player.getId())){
            log.warn("Trying to update a non-existent player");
            return ResponseEntity.notFound().build();
        }
        Player result = playerRepository.save(player);
        return ResponseEntity.ok(result);
    }


    /**
     * Borrar un jugador de la base de datos.
     */
    @DeleteMapping("api/players/{id}")
    public ResponseEntity<Player> delete(@PathVariable Long id){
        playerRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



    /**
     * Borrar todas los jugadores de la base de datos.
     */
    @DeleteMapping("api/players")
    public ResponseEntity<Player> deleteAll(){
        playerRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }


}
