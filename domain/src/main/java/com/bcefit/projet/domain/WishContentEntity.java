package com.bcefit.projet.domain;

import java.util.UUID;

public abstract class WishContentEntity {

    private String uid;

    private String idUser;

    public WishContentEntity() {
    }

    public WishContentEntity(String uid, String idUser) {
        this.uid = uid;
        this.idUser = idUser;
    }

    public void setAutoUid(){this.uid = UUID.randomUUID().toString();}

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
}
