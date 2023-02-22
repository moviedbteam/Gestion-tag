package com.bcefit.projet.application.watch;


import com.bcefit.projet.application.message.MessageString;
import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.watch.WatchEpisodeEntity;
import com.bcefit.projet.domain.watch.WatchEpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WatchEpisodeApplicationService implements WatchEpisodeApplicationServicePort{

    private WatchEpisodeRepository watchEpisodeRepository;

    @Autowired
    JmsTemplate jmsTemplate;

    public WatchEpisodeApplicationService(WatchEpisodeRepository watchEpisodeRepository){
        this.watchEpisodeRepository = watchEpisodeRepository;
    }

    @Override
    public List<WatchEpisodeEntity> getAllWatchEpisodes() {
        return watchEpisodeRepository.getAll();
    }

    @Override
    public void addWatchEpisode(WatchEpisodeEntity WatchEpisodeEntity) throws ResourceAlreadyExistsException {

        watchEpisodeRepository.addWatchEpisode(WatchEpisodeEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la watchList
        //jmsTemplate.send("Q_ADD_Watch_MOVIE", new MessageString(WatchEpisodeEntity.getUid()));
    }

    @Override
    public void deleteWatchEpisode(WatchEpisodeEntity WatchEpisodeEntity){
        watchEpisodeRepository.deleteWatchEpisode(WatchEpisodeEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la watchList
        //jmsTemplate.send("Q_DELETE_Watch_MOVIE", new MessageString(WatchEpisodeEntity.getUid()));
    }

}
