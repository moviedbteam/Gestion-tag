package com.bcefit.projet.domain.recommendation;

public class RecommendationMovieEntity {

    private String uid;

    private String idUser;

    private String idMovie;

    private Number popularity;

    private Integer voteCount;

    private Number voteAverage;

    public RecommendationMovieEntity() {
    }

    public RecommendationMovieEntity(String uid, String idUser, String idMovie, Number popularity, Integer voteCount, Number voteAverage) {
        this.uid = uid;
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
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

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public Number getPopularity() {
        return popularity;
    }

    public void setPopularity(Number popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Number getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Number voteAverage) {
        this.voteAverage = voteAverage;
    }
}
