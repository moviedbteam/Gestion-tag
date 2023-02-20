package com.bcefit.projet.infrastructure.watch;


import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import com.bcefit.projet.domain.ResourceNotExistsException;
import com.bcefit.projet.domain.watch.WatchMovieEntity;
import com.bcefit.projet.domain.watch.WatchMovieRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WatchMovieRepositoryAdaptater implements WatchMovieRepository {

    private final WatchMovieJpaRepository watchMovieJpaRepository;

    public WatchMovieRepositoryAdaptater(WatchMovieJpaRepository watchMovieJpaRepository){
        this.watchMovieJpaRepository = watchMovieJpaRepository;
    }

    @Override
    public List<WatchMovieEntity> getAll(){return watchMovieJpaRepository.findAll();}

    @Override
    public void addWatchMovie(WatchMovieEntity watchMovieEntity) throws ResourceAlreadyExistsException {
        if (watchMovieJpaRepository.existsById(watchMovieEntity.getUid())){
            throw new ResourceAlreadyExistsException("UID existant");
        }
        watchMovieJpaRepository.save(watchMovieEntity);
    }

    @Override
    public void deleteWatchMovie(WatchMovieEntity watchMovieEntity)  throws ResourceNotExistsException {
        if (!watchMovieJpaRepository.existsById(watchMovieEntity.getUid())) {
            throw new ResourceNotExistsException("Elément inexistant");
        }
        watchMovieJpaRepository.delete(watchMovieEntity);
    }
}
