package com.bcefit.projet.exposition.wish;

import java.util.UUID;

public class WishEpisodeDto {

    private UUID uid;

    private UUID idUser;

    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WishEpisodeDto() {
    }

    public WishEpisodeDto(UUID uid, UUID idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        this.uid = uid;
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
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

    public Integer getIdEpisode() {
        return this.idEpisode;
    }

    public void setIdEpisode(Integer idEpisode) {
        this.idEpisode = idEpisode;
    }

    public Integer getIdSeason() {
        return this.idSeason;
    }

    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }

    public Integer getIdTv() {
        return this.idTv;
    }

    public void setIdTv(Integer idTv) {
        this.idTv = idTv;
    }
}
