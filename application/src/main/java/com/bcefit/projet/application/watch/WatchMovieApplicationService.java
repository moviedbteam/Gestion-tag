package com.bcefit.projet.application.watch;

import com.bcefit.projet.application.message.MessageString;
import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.watch.WatchMovieEntity;
import com.bcefit.projet.domain.watch.WatchMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WatchMovieApplicationService implements WatchMovieApplicationServicePort {

    private WatchMovieRepository watchMovieRepository;

    @Autowired
    JmsTemplate jmsTemplate;

    public WatchMovieApplicationService(WatchMovieRepository watchMovieRepository){
        this.watchMovieRepository = watchMovieRepository;
    }


    @Override
    public List<WatchMovieEntity> getAllWatchMovies() {
        return watchMovieRepository.getAll();
    }

    @Override
    public void addWatchMovie(WatchMovieEntity watchMovieEntity) throws ResourceAlreadyExistsException {

        watchMovieRepository.addWatchMovie(watchMovieEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la watchList
        jmsTemplate.send("Q_ADD_Watch_MOVIE", new MessageString(watchMovieEntity.getUid()));
    }

    @Override
    public void deleteWatchMovie(WatchMovieEntity watchMovieEntity){
        watchMovieRepository.deleteWatchMovie(watchMovieEntity);
        // Envoie d'un message pour informer de l'ajout d'un film dans la watchList
        jmsTemplate.send("Q_DELETE_Watch_MOVIE", new MessageString(watchMovieEntity.getUid()));
    }

}
