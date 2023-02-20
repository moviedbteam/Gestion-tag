package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.GenreTvEntity;

import java.util.ArrayList;
import java.util.List;

public class GenreTvMapper {

    public static GenreTvDto mapToDto(GenreTvEntity entity){
        GenreTvDto dto = new GenreTvDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static List<GenreTvDto> matToListDto(List<GenreTvEntity> entities){
        List<GenreTvDto> dtoList = new ArrayList<>();
        for (GenreTvEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }
}
