package com.bcefit.projet.domain;

import java.util.List;

public interface WishEpisodeRepository {
    List<WishEpisodeEntity> getAll();

    void addWishEpisode(WishEpisodeEntity wishEpisodeEntity);


    void deleteWishEipsode(WishEpisodeEntity wishEpisodeEntity);
}
