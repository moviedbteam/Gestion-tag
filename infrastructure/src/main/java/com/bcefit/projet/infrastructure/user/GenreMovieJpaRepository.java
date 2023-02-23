package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GenreMovieJpaRepository extends JpaRepository<GenreMovieEntity, String> {

}