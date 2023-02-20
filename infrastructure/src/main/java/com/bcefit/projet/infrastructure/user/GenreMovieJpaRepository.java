package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreMovieJpaRepository extends JpaRepository<GenreMovieEntity, String> {
}