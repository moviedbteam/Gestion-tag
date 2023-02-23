package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.UserAccountEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserAccountApplicationServicePort {
    UserAccountEntity findById(UUID id);

    List<UserAccountEntity> getAllUsers();

}
