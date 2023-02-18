package com.bcefit.projet.exposition.wish.movie;



public class WishMovieDto {

    private String uid;

    private String idUser;

    private String idMovie;

    private String idCollection;

    public WishMovieDto() {
    }

    public WishMovieDto(String uid, String idUser, String idMovie, String idCollection) {
        this.uid = uid;
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
