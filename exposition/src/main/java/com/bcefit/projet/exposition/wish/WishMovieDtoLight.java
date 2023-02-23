package com.bcefit.projet.exposition.wish;

import java.util.UUID;

public class WishMovieDtoLight {

    private UUID idUser;

    private Integer idMovie;

    private Integer idCollection;

    public WishMovieDtoLight() {
    }

    public WishMovieDtoLight(UUID idUser, Integer idMovie, Integer idCollection) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }


    public UUID getIdUser() {
        return this.idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }


    public Integer getIdMovie() {
        return this.idMovie;
    }

    public void setIdMovie(Integer idMovie) {this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return this.idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }
}

