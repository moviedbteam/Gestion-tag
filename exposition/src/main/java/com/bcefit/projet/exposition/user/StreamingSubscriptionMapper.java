package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;

import java.util.ArrayList;
import java.util.List;

public class StreamingSubscriptionMapper {

    public static StreamingSubscriptionDto mapToDto(StreamingSubscriptionEntity entity){
        StreamingSubscriptionDto dto = new StreamingSubscriptionDto();
        dto.setId((entity.getId()));
        dto.setName(entity.getName());
        return dto;
    }

    public static List<StreamingSubscriptionDto> mapToListDto(List<StreamingSubscriptionEntity> entities){
        List<StreamingSubscriptionDto> dtoList = new ArrayList<>();
        for(StreamingSubscriptionEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }
}
