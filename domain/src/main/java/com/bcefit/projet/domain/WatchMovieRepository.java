package com.bcefit.projet.domain;

import java.util.List;

public interface WatchMovieRepository {

    List<WatchMovieEntity> getAll();
    void addWatchMovie(WatchMovieEntity watchMovieEntity);

    void deleteWatchMovie(WatchMovieEntity watchMovieEntity);
}
