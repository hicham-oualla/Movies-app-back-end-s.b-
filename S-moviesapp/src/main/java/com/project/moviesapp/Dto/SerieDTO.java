package com.project.moviesapp.Dto;

import com.project.moviesapp.model.Series;
import lombok.*;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SerieDTO {
    private int id_serie;
    private String titre;
    private  String description ;
    private Date date_debut;
    private Date datefin ;
    private  String  saison  ;
    private String genre;
    private  String createur;
    private  String acteur;
    private String note ;
    public SerieDTO toDto(Series S){
        return SerieDTO.builder()
                .id_serie(S.getId_serie())
                .titre(S.getTitre())
                .description(S.getDescription())
                .date_debut(S.getDate_debut())
                .datefin(S.getDatefin())
                .saison(S.getSaison())
                .genre(S.getGenre())
                .createur(S.getCreateur())
                .acteur(S.getActeur())
                .note(S.getNote())
                .build();
    }

}
