package com.project.moviesapp.Dto;

import lombok.Data;

import java.util.Date;
@Data
public class FilmDTO {
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
