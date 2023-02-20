package com.bcefit.projet.infrastructure.wish;

import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.ResourceNotExistsException;
import com.bcefit.projet.domain.wish.WishEpisodeEntity;
import com.bcefit.projet.domain.wish.WishEpisodeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WishEpisodeRepositoryAdaptater implements WishEpisodeRepository {

    private final WishEpisodeJpaRepository wishEpisodeJpaRepository;

    public WishEpisodeRepositoryAdaptater(WishEpisodeJpaRepository wishEpisodeJpaRepository){
        this.wishEpisodeJpaRepository = wishEpisodeJpaRepository;
    }

    @Override
    public List<WishEpisodeEntity> getAll(){return wishEpisodeJpaRepository.findAll();}

    @Override
    public void addWishEpisode(WishEpisodeEntity wishEpisodeEntity)  throws ResourceAlreadyExistsException {
        if (wishEpisodeJpaRepository.existsById(wishEpisodeEntity.getUid())){
            throw new ResourceAlreadyExistsException("UID existant");
        }
        wishEpisodeJpaRepository.save(wishEpisodeEntity);
    }

    @Override
    public void deleteWishEipsode(WishEpisodeEntity wishEpisodeEntity) throws ResourceNotExistsException {
        if (!wishEpisodeJpaRepository.existsById(wishEpisodeEntity.getUid())) {
            throw new ResourceNotExistsException("Elément inexistant");
        }
        wishEpisodeJpaRepository.delete(wishEpisodeEntity);
    }
}
