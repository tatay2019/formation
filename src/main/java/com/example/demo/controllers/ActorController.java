package com.example.demo.controllers;

import com.example.demo.entities.Actor;
import com.example.demo.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping(value = "/actors")
    public List<Actor> findAll() {
        return actorService.findAll();
    }

    @GetMapping(value = "/actors/{id}")
    public Actor findActor(@PathVariable(value = "id") Long id){ return actorService.findById(id); }

    @PostMapping(value = "/actors")
    public Actor saveActor(@RequestBody Actor actor) { return actorService.save(actor); }

    @PutMapping(value = "actors")
    public Actor update (@RequestBody Actor actor) { return actorService.update(actor);}

    @DeleteMapping(value = "/actors")
    public void deleteActor(Long id ) { actorService.deleteById(id);}


}
