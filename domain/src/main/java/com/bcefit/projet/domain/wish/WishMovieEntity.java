package com.bcefit.projet.domain.wish;

import java.util.UUID;

public class WishMovieEntity extends WishContentEntity {


    private Integer idMovie;

    private Integer idCollection;

    public WishMovieEntity() {
    }

    public WishMovieEntity(UUID uid, UUID idUser, Integer idMovie, Integer idCollection) {
        super(uid,idUser);
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public Integer getIdMovie() {
        return this.idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return this.idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }

}
