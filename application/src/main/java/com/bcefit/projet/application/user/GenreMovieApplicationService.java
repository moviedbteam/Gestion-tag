package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.GenreMovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GenreMovieApplicationService implements GenreMovieApplicationServicePort {

    private GenreMovieRepository genreMovieRepository;

    public GenreMovieApplicationService(GenreMovieRepository genreMovieRepository){
        this.genreMovieRepository = genreMovieRepository;
    }
    @Override
    public List<GenreMovieEntity> getAllGenreMovie() {return genreMovieRepository.getAll();}
}
