package com.bcefit.projet.infrastructure.user;


import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;
import com.bcefit.projet.domain.user.StreamingSubscriptionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StreamingSubscriptionRepositoryAdaptater implements StreamingSubscriptionRepository {

    private final StreamingSubscriptionJpaRepository streamingSubscriptionJpaRepository;

    public StreamingSubscriptionRepositoryAdaptater(StreamingSubscriptionJpaRepository streamingSubscriptionJpaRepository){
        this.streamingSubscriptionJpaRepository = streamingSubscriptionJpaRepository;
    }

    @Override
    public List<StreamingSubscriptionEntity> getAll(){return streamingSubscriptionJpaRepository.findAll();}
}
