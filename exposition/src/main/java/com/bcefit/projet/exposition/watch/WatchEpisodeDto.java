package com.bcefit.projet.exposition.watch;

public class WatchEpisodeDto {

    private String uid;

    private Integer idUser;

    private Integer idEpisode;

    private Integer idSeason;

    private Integer idTv;

    // Cinéma, TV, illégale ou autre
    private String viewingPlace;

    // Note de 1 à 5
    private Integer viewingRate;

    // Nombre associé à des humeurs :
    // 1=Choqué, 2=Frustré, 3= Triste, 4=Songeur, 5=Emu, 6=Amusé, 7= Effrayé, 8=Las, 9=Compris, 10=Ravi, 11= Perdu, 12= Tendu
    private Integer viewingMood;

    public WatchEpisodeDto() {
    }

    public WatchEpisodeDto(String uid, Integer idUser, Integer idEpisode, Integer idSeason, Integer idTv, String viewingPlace, Integer viewingRate, Integer viewingMood) {
        this.uid = uid;
        this.idUser = idUser;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
        this.viewingPlace = viewingPlace;
        this.viewingRate = viewingRate;
        this.viewingMood = viewingMood;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
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

    public String getViewingPlace() {
        return viewingPlace;
    }

    public void setViewingPlace(String viewingPlace) {
        this.viewingPlace = viewingPlace;
    }

    public Integer getViewingRate() {
        return viewingRate;
    }

    public void setViewingRate(Integer viewingRate) {
        this.viewingRate = viewingRate;
    }

    public Integer getViewingMood() {
        return viewingMood;
    }

    public void setViewingMood(Integer viewingMood) {
        this.viewingMood = viewingMood;
    }
}
