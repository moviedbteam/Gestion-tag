package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;

import java.util.List;

public interface StreamingSubscriptionApplicationServicePort {
    List<StreamingSubscriptionEntity> getAllStreamingSubscription();
}
