package com.bcefit.projet.application;


import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.WatchMovieEntity;


import java.util.List;

public interface WatchMovieApplicationServicePort {

    List<WatchMovieEntity> getAllWatchMovies();

    void addWatchMovie(WatchMovieEntity watchMovieEntity) throws ResourceAlreadyExistsException;

    void deleteWatchMovie(WatchMovieEntity watchMovieEntity);
}
