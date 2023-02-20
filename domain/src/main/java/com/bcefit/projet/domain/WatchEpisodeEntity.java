package com.bcefit.projet.domain;

public class WatchEpisodeEntity extends WatchContentEntity{

    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WatchEpisodeEntity() {
    }

    public WatchEpisodeEntity(Integer idEpisode, Integer idSeason, Integer idTv) {
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public WatchEpisodeEntity(String uid, String idUser, String viewingPlace, Integer viewingRate, Integer viewingMood, Integer idEpisode, Integer idSeason, Integer idTv) {
        super(uid, idUser, viewingPlace, viewingRate, viewingMood);
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public WatchEpisodeEntity(String uuid, Integer idEpisode, Integer idSeason, Integer idTv) {
        super(uuid);
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
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
