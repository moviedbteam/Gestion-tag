package com.bcefit.projet.infrastructure.user;


import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.GenreTvEntity;
import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;
import com.bcefit.projet.domain.user.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserAccountJpaRepository extends JpaRepository<UserAccountEntity, UUID> {

    UserAccountEntity getUserAccountEntityByIdUser(UUID uuid);


}
