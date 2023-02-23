package com.bcefit.projet.domain.watch;

import java.util.UUID;

public class WatchMovieEntity extends WatchContentEntity{

    private Integer idMovie;

    private Integer idCollection;


    public WatchMovieEntity() {
    }


    public WatchMovieEntity(UUID uid, UUID idUser, String viewingPlace, Integer viewingRate, Integer viewingMood, Integer idMovie, Integer idCollection) {
        super(uid, idUser, viewingPlace, viewingRate, viewingMood);
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }
}
