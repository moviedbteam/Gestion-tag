package com.bcefit.projet.exposition.wish;

import java.util.UUID;

public class WishMovieDtoUid {
    private UUID uid;

    public WishMovieDtoUid(UUID uid) {
        this.uid = uid;
    }

    public UUID getUid() {
        return this.uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }
}
