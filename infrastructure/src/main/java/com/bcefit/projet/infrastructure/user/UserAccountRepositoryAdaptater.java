package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.ResourceNotExistsException;
import com.bcefit.projet.domain.user.UserAccountEntity;
import com.bcefit.projet.domain.user.UserAccountRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserAccountRepositoryAdaptater implements UserAccountRepository {

    private final UserAccountJpaRepository userAccountJpaRepository;

    public UserAccountRepositoryAdaptater(UserAccountJpaRepository userAccountJpaRepository){
        this.userAccountJpaRepository = userAccountJpaRepository;
    }

    @Override
    public UserAccountEntity findById(final UUID id) {
        return userAccountJpaRepository.getUserAccountEntityByIdUser(id);
	}

    @Override
    public List<UserAccountEntity> getAll() {
        return userAccountJpaRepository.findAll();
    }

}
