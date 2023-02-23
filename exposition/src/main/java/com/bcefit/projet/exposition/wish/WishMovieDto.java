package com.bcefit.projet.exposition.wish;


import java.util.UUID;

public class WishMovieDto {

    private UUID uid;

    private UUID idUser;

    private Integer idMovie;

    private Integer idCollection;

    public WishMovieDto() {
    }

    public WishMovieDto(UUID uid, UUID idUser, Integer idMovie, Integer idCollection) {
        this.uid = uid;
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }


    public UUID getUid() {
        return this.uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
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
