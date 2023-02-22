package com.bcefit.projet.application.wish;

import com.bcefit.projet.application.message.MessageString;
import com.bcefit.projet.domain.wish.WishEpisodeEntity;
import com.bcefit.projet.domain.wish.WishEpisodeRepository;
import com.bcefit.projet.domain.wish.WishMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WishEpisodeApplicationService implements WishEpisodeApplicationServicePort{

    private WishEpisodeRepository wishEpisodeRepository;

    @Autowired
    JmsTemplate jmsTemplate;

    public WishEpisodeApplicationService(WishEpisodeRepository wishEpisodeRepository){
        this.wishEpisodeRepository = wishEpisodeRepository;
    }

    @Override
    public List<WishEpisodeEntity> getAllWishEpisodes() {
        return wishEpisodeRepository.getAll();
    }

    @Override
    public void addWishEpisode(WishEpisodeEntity wishEpisodeEntity) {
        wishEpisodeRepository.addWishEpisode(wishEpisodeEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la wishList
        //jmsTemplate.send("Q_ADD_Wish_EPISODE", new MessageString(wishEpisodeEntity.getUid()));
    }

    @Override
    public void deleteWishEpisode(WishEpisodeEntity wishEpisodeEntity) {
        wishEpisodeRepository.deleteWishEipsode(wishEpisodeEntity);
        //jmsTemplate.send("Q_DELETE_Wish_EPISODE", new MessageString(wishEpisodeEntity.getUid()));
    }
}
