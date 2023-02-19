package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.WishEpisodeEntity;
import com.bcefit.projet.domain.WishEpisodeRepository;

import java.util.List;

public class WishEpisodeRepositoryAdaptater implements WishEpisodeRepository {

    private final WishEpisodeJpaRepository wishEpisodeJpaRepository;

    public WishEpisodeRepositoryAdaptater(WishEpisodeJpaRepository wishEpisodeJpaRepository){
        this.wishEpisodeJpaRepository = wishEpisodeJpaRepository;
    }

    @Override
    public List<WishEpisodeEntity> getAll(){return wishEpisodeJpaRepository.findAll();}

    @Override
    public void addWishEpisode(WishEpisodeEntity wishEpisodeEntity) {wishEpisodeJpaRepository.save(wishEpisodeEntity);}

    @Override
    public void deleteWishEipsode(WishEpisodeEntity wishEpisodeEntity){wishEpisodeJpaRepository.delete(wishEpisodeEntity);}
}
