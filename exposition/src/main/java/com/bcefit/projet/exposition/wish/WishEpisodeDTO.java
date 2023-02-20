package com.bcefit.projet.exposition.wish;

public class WishEpisodeDTO {

    private String uid;

    private String idUser;

    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WishEpisodeDTO() {
    }

    public WishEpisodeDTO(String uid, String idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        this.uid = uid;
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public WishEpisodeDTO(String idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
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

    public Integer getIdEpisode() {
        return idEpisode;
    }

    public void setIdEpisode(Integer idEpisode) {
        this.idEpisode = idEpisode;
    }

    public Integer getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }

    public Integer getIdTv() {
        return idTv;
    }

    public void setIdTv(Integer idTv) {
        this.idTv = idTv;
    }
}
