package c;

import com.project.moviesapp.model.Film;
import lombok.*;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
     public static FilmDTO toDto(Film film) {
         return FilmDTO.builder()
                 .id_film(film.getId_film())
                 .text(film.getText())
                 .description(film.getDescription())
                 .date_debut(film.getDate_debut())
                 .date_fin(film.getDate_fin())
                 .saison(film.getSaison())
                 .genre(film.getGenre())
                 .createur(film.getCreateur())
                 .acteur(film.getActeur())
                 .note(film.getNote())
                 .build();

     }
}
