package com.bcefit.projet.exposition.user;


import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.UserAccountEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class UserAccountMapper {



    public static UserAccountDto mapToDto(UserAccountEntity entity){
        UserAccountDto dto = new UserAccountDto();
        dto.setIdUser(entity.getIdUser());
        dto.setUserName(entity.getUserName());
        dto.setEmail(entity.getEmail());
        dto.setBirthYear(entity.getBirthYear());
        //dto.setGenreMovieList(GenreMovieMapper.mapToListDto(entity.getGenreMovieList()));
        //dto.setGenreTvList(GenreTvMapper.matToListDto(entity.getGenreTvList()));
        //dto.setStreamingSubscriptionList(StreamingSubscriptionMapper.mapToListDto(entity.getStreamingSubscriptionList()));
        return dto;

    }

    public static UserAccountEntity mapToEntity(UserAccountDto dto){
        UserAccountEntity entity = new UserAccountEntity();
        entity.setIdUser(dto.getIdUser());
        entity.setUserName(dto.getUserName());
        entity.setEmail(dto.getEmail());
        entity.setBirthYear(dto.getBirthYear());
        //entity.setGenreMovieList(GenreMovieMapper.mapToListEntity(dto.getGenreMovieList()));
        //entity.setGenreTvList((GenreTvMapper.matToListEntity(dto.getGenreTvList())));
        //entity.setStreamingSubscriptionList(StreamingSubscriptionMapper.mapToListEntity(dto.getStreamingSubscriptionList()));
        return entity;
    }

    public static List<UserAccountDto> mapToListDto(List<UserAccountEntity> userAccountEntityList) {
        List<UserAccountDto> dtoList = new ArrayList<>();
        for(UserAccountEntity entity : userAccountEntityList){
            dtoList.add((mapToDto(entity)));
        }
        return dtoList;
    }

}
