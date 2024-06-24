package com.project.moviesapp.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FavoriteReques {
    private int filmId;
    private int  seriesId;
    private int userId;
    
}
