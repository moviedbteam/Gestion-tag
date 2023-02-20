package com.bcefit.projet.domain.wish;

public class WishMovieEntity extends WishContentEntity {


    private Integer idMovie;

    private Integer idCollection;

    public WishMovieEntity() {
    }

    public WishMovieEntity(String uid, Integer idUser, Integer idMovie, Integer idCollection) {
        super(uid,idUser);
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
