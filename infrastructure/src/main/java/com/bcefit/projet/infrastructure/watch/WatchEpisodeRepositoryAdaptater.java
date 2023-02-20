package com.bcefit.projet.infrastructure.watch;

import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.ResourceNotExistsException;
import com.bcefit.projet.domain.watch.WatchEpisodeEntity;
import com.bcefit.projet.domain.watch.WatchEpisodeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WatchEpisodeRepositoryAdaptater implements WatchEpisodeRepository {

    private final WatchEpisodeJpaRepository watchEpisodeJpaRepository;

    public WatchEpisodeRepositoryAdaptater(WatchEpisodeJpaRepository watchEpisodeJpaRepository){
        this.watchEpisodeJpaRepository = watchEpisodeJpaRepository;
    }
    @Override
    public List<WatchEpisodeEntity> getAll() {return watchEpisodeJpaRepository.findAll();}

    @Override
    public void addWatchEpisode(WatchEpisodeEntity watchEpisodeEntity)  throws ResourceAlreadyExistsException {
        if (watchEpisodeJpaRepository.existsById(watchEpisodeEntity.getUid())){
            throw new ResourceAlreadyExistsException("UID existant");
        }
        watchEpisodeJpaRepository.save(watchEpisodeEntity);
    }

    @Override
    public void deleteWatchEpisode(WatchEpisodeEntity watchEpisodeEntity)  throws ResourceNotExistsException {
        if (!watchEpisodeJpaRepository.existsById(watchEpisodeEntity.getUid())) {
            throw new ResourceNotExistsException("Elément inexistant");
        }
        watchEpisodeJpaRepository.delete(watchEpisodeEntity);
    }
}
