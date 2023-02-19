package com.bcefit.projet.domain;

import java.util.Date;
import java.util.UUID;

public class WishMovieEntity extends WishContentEntity {


    private String idMovie;

    private String idCollection;

    public WishMovieEntity() {
    }

    public WishMovieEntity(String uid, String idUser, String idMovie, String idCollection) {
        super(uid,idUser);
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
