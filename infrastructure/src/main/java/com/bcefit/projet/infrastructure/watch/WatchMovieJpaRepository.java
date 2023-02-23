package com.bcefit.projet.infrastructure.watch;

import com.bcefit.projet.domain.watch.WatchMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WatchMovieJpaRepository extends JpaRepository<WatchMovieEntity, UUID> {
}
