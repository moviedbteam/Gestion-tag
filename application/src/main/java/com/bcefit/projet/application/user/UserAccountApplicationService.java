package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.UserAccountEntity;
import com.bcefit.projet.domain.user.UserAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserAccountApplicationService implements UserAccountApplicationServicePort {

    private UserAccountRepository userAccountRepository;

    public UserAccountApplicationService(UserAccountRepository userAccountRepository){
        this.userAccountRepository = userAccountRepository;
    }
    @Override
    public UserAccountEntity findById(String id) {
        return userAccountRepository.findById(id);
    }

    @Override
    public List<UserAccountEntity> getAllUsers() {
        return userAccountRepository.getAll();
    }
}
