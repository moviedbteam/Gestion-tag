package com.bcefit.projet.exposition.wish;

public class WishMovieDtoLight {

    private String uid;

    private Integer idUser;

    private Integer idMovie;

    private Integer idCollection;

    public WishMovieDtoLight() {
    }

    public WishMovieDtoLight(Integer idUser, Integer idMovie, Integer idCollection) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }
}

