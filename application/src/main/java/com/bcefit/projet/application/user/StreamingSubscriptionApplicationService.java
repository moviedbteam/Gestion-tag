package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;
import com.bcefit.projet.domain.user.StreamingSubscriptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StreamingSubscriptionApplicationService implements StreamingSubscriptionApplicationServicePort{

    private StreamingSubscriptionRepository streamingSubscriptionRepository;

    public StreamingSubscriptionApplicationService(StreamingSubscriptionRepository streamingSubscriptionRepository){
        this.streamingSubscriptionRepository = streamingSubscriptionRepository;
    }

    @Override
    public List<StreamingSubscriptionEntity> getAllStreamingSubscription() {return streamingSubscriptionRepository.getAll();}

}
