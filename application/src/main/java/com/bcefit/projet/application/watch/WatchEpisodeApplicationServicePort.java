package com.bcefit.projet.application.watch;


import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.watch.WatchEpisodeEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface WatchEpisodeApplicationServicePort {


    List<WatchEpisodeEntity> getAllWatchEpisodes();

    void addWatchEpisode(WatchEpisodeEntity watchEpisodeEntity) throws ResourceAlreadyExistsException;

    void deleteWatchEpisode(WatchEpisodeEntity watchEpisodeEntity);
}
