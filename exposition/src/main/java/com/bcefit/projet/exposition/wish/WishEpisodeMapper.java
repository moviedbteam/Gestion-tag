package com.bcefit.projet.exposition.wish;

import com.bcefit.projet.domain.wish.WishEpisodeEntity;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WishEpisodeMapper {
    public static WishEpisodeDto mapToDto(WishEpisodeEntity entity){
        WishEpisodeDto dto = new WishEpisodeDto();
        dto.setUid(entity.getUid());
        dto.setIdEpisode(entity.getIdEpisode());
        dto.setIdSeason(entity.getIdSeason());
        dto.setIdTv(entity.getIdTv());
        dto.setIdUser(entity.getIdUser());
        return dto;
    }

    public static WishEpisodeEntity mapToEntity(WishEpisodeDtoLight dto){
        WishEpisodeEntity entity = new WishEpisodeEntity();
        entity.setAutoUid();
        entity.setIdUser(dto.getIdUser());
        entity.setIdEpisode(dto.getIdEpisode());
        entity.setIdSeason(dto.getIdSeason());
        entity.setIdTv(dto.getIdTv());
        return entity;
    }


    public static WishEpisodeEntity mapToEntity(UUID uid){
        WishEpisodeEntity entity = new WishEpisodeEntity();
        entity.setUid(uid);
        return entity;
    }


    public static List<WishEpisodeDto> mapToListDto(List<WishEpisodeEntity> entities){
        List<WishEpisodeDto> wishEpisodeDTOList = new ArrayList<>();
        for(WishEpisodeEntity entity : entities){
            wishEpisodeDTOList.add(mapToDto(entity));
        }
        return wishEpisodeDTOList;
    }
}
