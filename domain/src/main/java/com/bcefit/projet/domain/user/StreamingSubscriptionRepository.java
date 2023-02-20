package com.bcefit.projet.domain.user;

import java.util.List;

public interface StreamingSubscriptionRepository {
    List<StreamingSubscriptionEntity> getAll();
}
