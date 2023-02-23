package com.bcefit.projet.exposition.watch;


import com.bcefit.projet.domain.watch.WatchMovieEntity;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class WatchMovieMapper {

    public static WatchMovieDto mapToDto(WatchMovieEntity entity){
        WatchMovieDto dto = new WatchMovieDto();
        dto.setUid(entity.getUid());
        dto.setIdMovie(entity.getIdMovie());
        dto.setIdCollection(entity.getIdCollection());
        dto.setIdUser(entity.getIdUser());
        dto.setViewingMood(entity.getViewingMood());
        dto.setViewingPlace(entity.getViewingPlace());
        dto.setViewingRate(entity.getViewingRate());
        return dto;
    }

    public static WatchMovieEntity mapToEntity(WatchMovieDtoLight dto){
        WatchMovieEntity entity = new WatchMovieEntity();
        entity.setAutoUid();
        entity.setIdUser(dto.getIdUser());
        entity.setIdMovie(dto.getIdMovie());
        entity.setIdCollection(dto.getIdCollection());
        entity.setViewingMood(dto.getViewingMood());
        entity.setViewingPlace(dto.getViewingPlace());
        entity.setViewingRate(dto.getViewingRate());
        return entity;
    }

    public static WatchMovieEntity mapToEntity(UUID uid){
        WatchMovieEntity entity = new WatchMovieEntity();
        entity.setUid(uid);
        return entity;
    }


    public static List<WatchMovieDto> mapToListDto(List<WatchMovieEntity> entities){
        List<WatchMovieDto> watchMovieDTOList = new ArrayList<>();
        for(WatchMovieEntity entity : entities){
            watchMovieDTOList.add(mapToDto(entity));
        }
        return watchMovieDTOList;
    }
}
