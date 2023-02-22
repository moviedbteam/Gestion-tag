package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.GenreTvEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class GenreTvMapper {

    public static GenreTvDto mapToDto(GenreTvEntity entity){
        GenreTvDto dto = new GenreTvDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static GenreTvEntity mapToEntity(GenreTvDto dto){
        GenreTvEntity entity = new GenreTvEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }


    public static List<GenreTvDto> matToListDto(List<GenreTvEntity> entities){
        List<GenreTvDto> dtoList = new ArrayList<>();
        for (GenreTvEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }

    public static List<GenreTvEntity> matToListEntity(List<GenreTvDto> genreTvList) {
        List<GenreTvEntity> entityList = new ArrayList<>();
        for (GenreTvDto dto : genreTvList){
            entityList.add(mapToEntity(dto));
        }
        return entityList;
    }
}
