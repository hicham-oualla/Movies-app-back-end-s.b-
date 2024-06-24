package com.project.moviesapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Favorite {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Film film;


    @ManyToOne
    @JoinColumn(name = "id_serie")
    private Series serie;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;

}
