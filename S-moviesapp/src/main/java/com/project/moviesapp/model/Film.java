package com.project.moviesapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Film {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_film;
        private String text ;
        private  String description ;
        private Date date_debut;
        private  Date date_fin ;
        private String saison ;
        private String genre ;
        private String createur ;
        private String acteur ;
        private String note ;



    }
