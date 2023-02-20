package com.bcefit.projet.domain.wish;

import java.util.UUID;

public abstract class WishContentEntity {

    private String uid;

    private Integer idUser;

    public WishContentEntity() {
    }

    public WishContentEntity(String uid, Integer idUser) {
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

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
