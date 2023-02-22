package com.bcefit.projet.domain.user;

import java.util.List;
import java.util.Optional;

public interface UserAccountRepository {

    UserAccountEntity findById(String id);

    List<UserAccountEntity> getAll();
}
