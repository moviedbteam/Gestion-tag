package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UserAccountApplicationService implements UserAccountApplicationServicePort {

    private UserAccountRepository userAccountRepository;
    private GenreMovieRepository genreMovieRepository;
    private GenreTvRepository genreTvRepository;
    private StreamingSubscriptionRepository streamingSubscriptionRepository;

    public UserAccountApplicationService(UserAccountRepository userAccountRepository){
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccountEntity findById(UUID id) {
        UserAccountEntity userAccountEntity;
        userAccountEntity = userAccountRepository.findById(id);

        return userAccountEntity;
    }

    @Override
    public List<UserAccountEntity> getAllUsers() {
        return userAccountRepository.getAll();
    }
}
