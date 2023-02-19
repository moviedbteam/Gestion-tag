package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.GenreTvEntity;
import com.bcefit.projet.domain.GenreTvRepository;

import java.util.List;

public class GenreTvRepositoryAdaptater implements GenreTvRepository {

    private final GenreTvJpaRepository genreTvJpaRepository;

    public GenreTvRepositoryAdaptater(GenreTvJpaRepository genreTvJpaRepository){
        this.genreTvJpaRepository = genreTvJpaRepository;
    }

    @Override
    public List<GenreTvEntity> getAll(){return genreTvJpaRepository.findAll();}
}
