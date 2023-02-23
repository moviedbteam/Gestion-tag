package com.bcefit.projet.exposition.watch;

import java.util.UUID;

public class WatchEpisodeDtoUid {

    private UUID uid;

    public WatchEpisodeDtoUid(UUID uid) {
        this.uid = uid;
    }

    public UUID getUid() {
        return this.uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }
}
