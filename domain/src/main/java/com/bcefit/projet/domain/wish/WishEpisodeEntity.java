package com.bcefit.projet.domain.wish;

import java.util.UUID;

public class WishEpisodeEntity extends WishContentEntity{


    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WishEpisodeEntity() {
        super();
    }

    public WishEpisodeEntity(UUID uid, UUID idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        super(uid,idUser);
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public Integer getIdEpisode() {
        return this.idEpisode;
    }

    public void setIdEpisode(Integer idEpisode) {
        this.idEpisode = idEpisode;
    }

    public Integer getIdTv() {
        return this.idTv;
    }

    public void setIdTv(Integer idTv) {
        this.idTv = idTv;
    }

    public Integer getIdSeason() {
        return this.idSeason;
    }

    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }
}
