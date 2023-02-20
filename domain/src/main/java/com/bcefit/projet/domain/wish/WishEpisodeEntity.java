package com.bcefit.projet.domain.wish;

public class WishEpisodeEntity extends WishContentEntity{


    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    public WishEpisodeEntity() {
        super();
    }

    public WishEpisodeEntity(String uid, String idUser, Integer idEpisode, Integer idSeason, Integer idTv) {
        super(uid,idUser);
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

    public Integer getIdTv() {
        return idTv;
    }

    public void setIdTv(Integer idTv) {
        this.idTv = idTv;
    }

    public Integer getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }
}
