package com.bcefit.projet.application.watch;


import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.watch.WatchMovieEntity;


import java.util.List;

public interface WatchMovieApplicationServicePort {

    List<WatchMovieEntity> getAllWatchMovies();

    void addWatchMovie(WatchMovieEntity watchMovieEntity) throws ResourceAlreadyExistsException;

    void deleteWatchMovie(WatchMovieEntity watchMovieEntity);
}
