package com.example.demo.repositories;

import com.example.demo.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface FilmRepository extends JpaRepository<Film, Long> {
}
