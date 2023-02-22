package com.bcefit.projet.exposition.user;

import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StreamingSubscriptionMapper {

    public static StreamingSubscriptionDto mapToDto(StreamingSubscriptionEntity entity){
        StreamingSubscriptionDto dto = new StreamingSubscriptionDto();
        dto.setId((entity.getId()));
        dto.setName(entity.getName());
        return dto;
    }

    public static StreamingSubscriptionEntity mapToEntity(StreamingSubscriptionDto dto){
        StreamingSubscriptionEntity entity = new StreamingSubscriptionEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    public static List<StreamingSubscriptionDto> mapToListDto(List<StreamingSubscriptionEntity> entities){
        List<StreamingSubscriptionDto> dtoList = new ArrayList<>();
        for(StreamingSubscriptionEntity entity : entities){
            dtoList.add(mapToDto(entity));
        }
        return dtoList;
    }

    public static List<StreamingSubscriptionEntity> mapToListEntity(List<StreamingSubscriptionDto> streamingSubscriptionList) {
        List<StreamingSubscriptionEntity> entityList = new ArrayList<>();
        for (StreamingSubscriptionDto dto : streamingSubscriptionList){
            entityList.add(mapToEntity(dto));
        }
        return entityList;
    }
}
