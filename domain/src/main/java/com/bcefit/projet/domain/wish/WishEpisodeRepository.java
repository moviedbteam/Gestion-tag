package com.bcefit.projet.domain.wish;

import com.bcefit.projet.domain.ResourceAlreadyExistsException;

import java.util.List;

public interface WishEpisodeRepository {
    List<WishEpisodeEntity> getAll();

    void addWishEpisode(WishEpisodeEntity wishEpisodeEntity) throws ResourceAlreadyExistsException;


    void deleteWishEipsode(WishEpisodeEntity wishEpisodeEntity);
}
