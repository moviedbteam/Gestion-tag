package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;


import java.util.ArrayList;
import java.util.List;

public class GenreMovieMapper {

    public static GenreMovieDto mapToDto(GenreMovieEntity entity){
        GenreMovieDto dto = new GenreMovieDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static List<GenreMovieDto> mapToListDto(List<GenreMovieEntity> entities){
        List<GenreMovieDto> dtoList = new ArrayList<>();
        for(GenreMovieEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }
}
