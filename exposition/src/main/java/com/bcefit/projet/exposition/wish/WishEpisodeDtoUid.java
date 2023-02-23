package com.bcefit.projet.exposition.wish;

import java.util.UUID;

public class  WishEpisodeDtoUid {
    private UUID uid;

    public WishEpisodeDtoUid(UUID uid) {
        this.uid = uid;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }
}
