package com.bcefit.projet.domain.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserAccountRepository {

    UserAccountEntity findById(UUID id);

    List<UserAccountEntity> getAll();
}
