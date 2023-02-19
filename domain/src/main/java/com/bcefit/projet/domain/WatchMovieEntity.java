package com.bcefit.projet.domain;

public class WatchMovieEntity extends WatchContentEntity{

    private String idMovie;

    private String idCollection;


    public WatchMovieEntity() {
    }


    public WatchMovieEntity(String uid, String idUser, String viewingPlace, Integer viewingRate, Integer viewingMood, String idMovie, String idCollection) {
        super(uid, idUser, viewingPlace, viewingRate, viewingMood);
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(String idCollection) {
        this.idCollection = idCollection;
    }
}
