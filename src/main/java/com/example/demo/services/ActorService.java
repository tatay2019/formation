package com.example.demo.services;

import com.example.demo.entities.Actor;
import com.example.demo.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    public final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findAll() { return actorRepository.findAll(); }

    public Actor save(Actor actor)
    {
        return actorRepository.save(actor);
    }

    public Actor findById(Long id) {
        return actorRepository.findById(id).get();
    }

    public Actor update (Actor actor) { return actorRepository.save(actor);}

    public void deleteById(Long id) { actorRepository.deleteById(id);}
}
