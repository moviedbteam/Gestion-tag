package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.GenreMovieRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenreMovieRepositoryAdaptater implements GenreMovieRepository {

    private final GenreMovieJpaRepository genreMovieJpaRepository;

    public GenreMovieRepositoryAdaptater(GenreMovieJpaRepository genreMovieJpaRepository){
        this.genreMovieJpaRepository = genreMovieJpaRepository;
    }

    @Override
    public List<GenreMovieEntity> getAll(){return genreMovieJpaRepository.findAll();}

}
