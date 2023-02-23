package com.bcefit.projet.exposition.wish;


import com.bcefit.projet.domain.wish.WishMovieEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class WishMovieMapper {

    public static WishMovieDto mapToDto(WishMovieEntity entity){
        WishMovieDto dto = new WishMovieDto();
        dto.setUid(entity.getUid());
        dto.setIdMovie(entity.getIdMovie());
        dto.setIdCollection(entity.getIdCollection());
        dto.setIdUser(entity.getIdUser());
        return dto;
    }

    public static WishMovieEntity mapToEntity(WishMovieDtoLight dto){
        WishMovieEntity entity = new WishMovieEntity();
        entity.setAutoUid();
        entity.setIdUser(dto.getIdUser());
        entity.setIdMovie(dto.getIdMovie());
        entity.setIdCollection(dto.getIdCollection());
        return entity;
    }


    public static WishMovieEntity mapToEntity(UUID uid){
        WishMovieEntity entity = new WishMovieEntity();
        entity.setUid(uid);
        return entity;
    }


    public static List<WishMovieDto> mapToListDto(List<WishMovieEntity> entities){
        List<WishMovieDto> wishMovieDTOList = new ArrayList<>();
        for(WishMovieEntity entity : entities){
            wishMovieDTOList.add(mapToDto(entity));
        }
        return wishMovieDTOList;
    }
}
