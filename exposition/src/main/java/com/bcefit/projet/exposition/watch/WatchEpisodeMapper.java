package com.bcefit.projet.exposition.watch;

import com.bcefit.projet.domain.watch.WatchEpisodeEntity;
import com.bcefit.projet.domain.watch.WatchMovieEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WatchEpisodeMapper {

    public static WatchEpisodeDto mapToDto(WatchEpisodeEntity entity){
        WatchEpisodeDto dto = new WatchEpisodeDto();
        dto.setUid(entity.getUid());
        dto.setIdUser(entity.getIdUser());
        dto.setIdEpisode(entity.getIdEpisode());
        dto.setIdSeason(entity.getIdSeason());
        dto.setIdTv(entity.getIdTv());
        dto.setViewingMood(entity.getViewingMood());
        dto.setViewingPlace(entity.getViewingPlace());
        dto.setViewingRate(entity.getViewingRate());
        return dto;
    }

    public static WatchEpisodeEntity mapToEntity(WatchEpisodeDtoLight dtoLight){
        WatchEpisodeEntity entity = new WatchEpisodeEntity();
        entity.setAutoUid();
        entity.setIdUser(dtoLight.getIdUser());
        entity.setIdEpisode(dtoLight.getIdEpisode());
        entity.setIdSeason(dtoLight.getIdSeason());
        entity.setIdTv(dtoLight.getIdTv());
        entity.setViewingMood(dtoLight.getViewingMood());
        entity.setViewingPlace(dtoLight.getViewingPlace());
        entity.setViewingRate(dtoLight.getViewingRate());
        return entity;
    }

    public static WatchEpisodeEntity mapToEntity(UUID uid){
        WatchEpisodeEntity entity = new WatchEpisodeEntity();
        entity.setUid(uid);
        return entity;
    }

    public static List<WatchEpisodeDto> mapToListDto(List<WatchEpisodeEntity> entities){
        List<WatchEpisodeDto> watchEpisodeDTOList = new ArrayList<>();
        for(WatchEpisodeEntity entity : entities){
            watchEpisodeDTOList.add(mapToDto(entity));
        }
        return watchEpisodeDTOList;
    }
}
