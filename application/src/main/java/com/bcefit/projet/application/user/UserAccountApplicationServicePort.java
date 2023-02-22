package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.UserAccountEntity;

import java.util.List;
import java.util.Optional;

public interface UserAccountApplicationServicePort {
    UserAccountEntity findById(String id);

    List<UserAccountEntity> getAllUsers();

}
