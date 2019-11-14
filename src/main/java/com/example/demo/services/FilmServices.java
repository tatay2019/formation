package com.example.demo.services;

import com.example.demo.entities.Film;
import com.example.demo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServices {

    @Autowired
    private final FilmRepository filmRepository;

    public FilmServices(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }
    public Film save(Film film) {
        return filmRepository.save(film);
    }
    public void delete(Long id) {
        filmRepository.deleteById(id);
    }
    public Film update(Film film) { return filmRepository.save(film); }
    public Film findById(Long id) {
        return filmRepository.findById(id).get();
    }
}
