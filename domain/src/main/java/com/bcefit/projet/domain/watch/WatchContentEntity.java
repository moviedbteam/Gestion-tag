package com.bcefit.projet.domain.watch;

import java.util.UUID;

public abstract class WatchContentEntity {

    private String uid;

    private Integer idUser;

    // Cinéma, TV, illégale ou autre
    private String viewingPlace;

    // Note de 1 à 5
    private Integer viewingRate;

    // Nombre associé à des humeurs :
    // 1=Choqué, 2=Frustré, 3= Triste, 4=Songeur, 5=Emu, 6=Amusé, 7= Effrayé, 8=Las, 9=Compris, 10=Ravi, 11= Perdu, 12= Tendu
    private Integer viewingMood;

    public WatchContentEntity() {
    }

    public WatchContentEntity(String uid, Integer idUser, String viewingPlace, Integer viewingRate, Integer viewingMood) {
        this.uid = uid;
        this.idUser = idUser;
        this.viewingPlace = viewingPlace;
        this.viewingRate = viewingRate;
        this.viewingMood = viewingMood;
    }


    public WatchContentEntity(String uuid) {
        this.uid = uuid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAutoUid(){this.uid = UUID.randomUUID().toString();}

    public String getUid() {
        return uid;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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