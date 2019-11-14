package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFilm;
    @Column(unique = true)
    private String name;
    private String iconUrl;
    private String description;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "film")
    @JsonIgnoreProperties("film")
    private List<Actor> actors;

    public Film() {
    }

    public Film(String name, String iconUrl, String description, List <Actor> actors) {
        this.name = name;
        this.iconUrl = iconUrl;
        this.description = description;
        this.actors = actors;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List <Actor> getActors() {
        return actors;
    }

    public void setActors(List <Actor> actors) {
        this.actors = actors;
    }

    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
