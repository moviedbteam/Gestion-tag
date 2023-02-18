package com.bcefit.projet.infrastructure.wish;


import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.ResourceNotExistsException;
import com.bcefit.projet.domain.wish.WishMovieEntity;
import com.bcefit.projet.domain.wish.WishMovieRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WishMovieRepositoryAdaptater implements WishMovieRepository {

    private final WishMovieJpaRepository wishMovieJpaRepository;

    public WishMovieRepositoryAdaptater(WishMovieJpaRepository wishMovieJpaRepository){
        this.wishMovieJpaRepository = wishMovieJpaRepository;
    }

    @Override
    public List<WishMovieEntity> getAll(){return wishMovieJpaRepository.findAll();}

    @Override
    public void addWishMovie(WishMovieEntity wishMovieEntity) throws ResourceAlreadyExistsException {
        if (wishMovieJpaRepository.existsById(wishMovieEntity.getUid())){
            throw new ResourceAlreadyExistsException("UID existant");
        }
        wishMovieJpaRepository.save(wishMovieEntity);
    }

    @Override
    public void deleteWishMovie(WishMovieEntity wishMovieEntity) throws ResourceNotExistsException {
        if (!wishMovieJpaRepository.existsById(wishMovieEntity.getUid())) {
            throw new ResourceNotExistsException("Elément inexistant");
        }
        wishMovieJpaRepository.delete(wishMovieEntity);
    }
}
