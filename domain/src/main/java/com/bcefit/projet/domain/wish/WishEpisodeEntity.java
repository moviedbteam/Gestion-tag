package com.bcefit.projet.domain.wish;

import java.util.Date;

public class WishEpisodeEntity {

    private String uid;

    private String idUser;

    private Integer idEpisode;

    private Integer idSerie;

    private Integer idTv;

    public WishEpisodeEntity() {
        super();
    }

    public WishEpisodeEntity(String uid, String idUser, Integer idEpisode, Integer idSerie, Integer idTv) {
        this.uid = uid;
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSerie = idSerie;
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

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public Integer getIdTv() {
        return idTv;
    }

    public void setIdTv(Integer idTv) {
        this.idTv = idTv;
    }
}
