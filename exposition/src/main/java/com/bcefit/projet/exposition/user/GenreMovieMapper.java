package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


public class GenreMovieMapper {

    public static GenreMovieDto mapToDto(GenreMovieEntity entity){
        GenreMovieDto dto = new GenreMovieDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static GenreMovieEntity mapToEntity(GenreMovieDto dto){
        GenreMovieEntity entity = new GenreMovieEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    public static List<GenreMovieDto> mapToListDto(List<GenreMovieEntity> entities){
        List<GenreMovieDto> dtoList = new ArrayList<>();
        for(GenreMovieEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }

    public static List<GenreMovieEntity> mapToListEntity(List<GenreMovieDto> genreMovieList) {
        List<GenreMovieEntity> entityList = new ArrayList<>();
        for(GenreMovieDto dto : genreMovieList){
            entityList.add((mapToEntity(dto)));
        }
        return entityList;
    }
}
