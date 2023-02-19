package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.GenreMovieEntity;
import com.bcefit.projet.domain.GenreMovieRepository;

import java.util.List;

public class GenreMovieRepositoryAdaptater implements GenreMovieRepository {

    private final GenreMovieJpaRepository genreMovieJpaRepository;

    public GenreMovieRepositoryAdaptater(GenreMovieJpaRepository genreMovieJpaRepository){
        this.genreMovieJpaRepository = genreMovieJpaRepository;
    }

    @Override
    public List<GenreMovieEntity> getAll(){return genreMovieJpaRepository.findAll();}

}
