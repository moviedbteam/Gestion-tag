package com.bcefit.projet.application.wish;

import com.bcefit.projet.domain.wish.WishEpisodeEntity;

import java.util.List;

public interface WishEpisodeApplicationServicePort {
    List<WishEpisodeEntity> getAllWishEpisodes();

    void addWishEpisode(WishEpisodeEntity wishEpisodeEntity);

    void deleteWishEpisode(WishEpisodeEntity wishEpisodeEntity);
}
