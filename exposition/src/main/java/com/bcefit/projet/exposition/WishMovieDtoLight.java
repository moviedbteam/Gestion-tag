package com.bcefit.projet.exposition;

public class WishMovieDtoLight {

    private String uid;

    private String idUser;

    private String idMovie;

    private String idCollection;

    public WishMovieDtoLight() {
    }

    public WishMovieDtoLight(String idUser, String idMovie, String idCollection) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }


    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {this.idMovie = idMovie;
    }

    public String getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(String idCollection) {
        this.idCollection = idCollection;
    }
}

