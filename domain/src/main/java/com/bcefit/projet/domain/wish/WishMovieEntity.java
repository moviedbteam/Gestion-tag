package com.bcefit.projet.domain.wish;

import java.util.Date;
import java.util.UUID;

public class WishMovieEntity {

    private String uid;

    private String idUser;

    private String idMovie;

    private String idCollection;

    public WishMovieEntity() {
    }

    public WishMovieEntity(String uid, String idUser, String idMovie, String idCollection) {
        this.uid = uid;
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public WishMovieEntity(String uuid) {
        this.uid = uuid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAutoUid(){this.uid = UUID.randomUUID().toString();}

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

    public String getUid() {
        return uid;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
