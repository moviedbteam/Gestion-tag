package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.WatchMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StreamingSubscriptionJpaRepository extends JpaRepository<WatchMovieEntity, String> {
}
