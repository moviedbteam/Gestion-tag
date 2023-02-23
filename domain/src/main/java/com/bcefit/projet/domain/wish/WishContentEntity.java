package com.bcefit.projet.domain.wish;

import java.util.UUID;

public abstract class WishContentEntity {

    private UUID uid;

    private UUID idUser;

    public WishContentEntity() {
    }

    public WishContentEntity(UUID uid, UUID idUser) {
        this.uid = uid;
        this.idUser = idUser;
    }

    public void setAutoUid(){this.uid = UUID.randomUUID();}

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }
}
