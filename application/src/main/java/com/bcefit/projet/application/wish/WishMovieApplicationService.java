package com.bcefit.projet.application.wish;

import com.bcefit.projet.application.message.MessageString;
import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.wish.WishMovieEntity;
import com.bcefit.projet.domain.wish.WishMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WishMovieApplicationService implements WishMovieApplicationServicePort{

    private WishMovieRepository wishMovieRepository;

    @Autowired
    JmsTemplate jmsTemplate;

    public WishMovieApplicationService(WishMovieRepository wishMovieRepository){
        this.wishMovieRepository = wishMovieRepository;
    }


    @Override
    public List<WishMovieEntity> getAllWishMovies() {
        return wishMovieRepository.getAll();
    }

    @Override
    public void addWishMovie(WishMovieEntity wishMovieEntity) throws ResourceAlreadyExistsException {

        wishMovieRepository.addWishMovie(wishMovieEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la wishList
        //jmsTemplate.send("Q_ADD_Wish_MOVIE", new MessageString(wishMovieEntity.getUid()));
    }

    @Override
    public void deleteWishMovie(WishMovieEntity wishMovieEntity){
        wishMovieRepository.deleteWishMovie(wishMovieEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la wishList
        //jmsTemplate.send("Q_DELETE_Wish_MOVIE", new MessageString(wishMovieEntity.getUid()));
    }

}
