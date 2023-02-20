package com.bcefit.projet.exposition.wish;



public class WishMovieDto {

    private String uid;

    private Integer idUser;

    private Integer idMovie;

    private Integer idCollection;

    public WishMovieDto() {
    }

    public WishMovieDto(String uid, Integer idUser, Integer idMovie, Integer idCollection) {
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
