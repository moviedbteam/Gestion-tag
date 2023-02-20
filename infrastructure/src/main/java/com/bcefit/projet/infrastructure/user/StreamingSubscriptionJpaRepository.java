package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.watch.WatchMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StreamingSubscriptionJpaRepository extends JpaRepository<WatchMovieEntity, String> {
}
