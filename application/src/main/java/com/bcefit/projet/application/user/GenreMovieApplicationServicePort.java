package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;

import java.util.List;

public interface GenreMovieApplicationServicePort {
    List<GenreMovieEntity> getAllGenreMovie();
}
