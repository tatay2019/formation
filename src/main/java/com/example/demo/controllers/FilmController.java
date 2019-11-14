package com.example.demo.controllers;

import com.example.demo.entities.Film;
import com.example.demo.services.FilmServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*" + "")
public class FilmController {

    @Autowired
    private final FilmServices filmServices;


    public FilmController(FilmServices filmServices) {
        this.filmServices = filmServices;
    }

    @GetMapping("/films")
    public List<Film> findAll()
    {
        return filmServices.findAll();
    }

    @PostMapping("/films")
    public Film save(@RequestBody Film film){
        return filmServices.save(film);
    }

    @DeleteMapping("/films/{id}")
    public void delete(@PathVariable("id") Long id) {
        filmServices.delete(id);
    }

    @PutMapping("/films")
    public Film updateFilm(@RequestBody Film film) {
        return this.filmServices.update(film);
    }

    @GetMapping(value = "/films/{id}")
    public Film findFilm(@PathVariable(value = "id") Long id){ return filmServices.findById(id); }

}
