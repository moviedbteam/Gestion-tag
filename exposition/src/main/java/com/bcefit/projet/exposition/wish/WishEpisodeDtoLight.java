package com.bcefit.projet.exposition.wish;

import java.util.UUID;

public class WishEpisodeDtoLight {

    private UUID idUser;

    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WishEpisodeDtoLight() {
    }

    public WishEpisodeDtoLight(UUID idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
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

