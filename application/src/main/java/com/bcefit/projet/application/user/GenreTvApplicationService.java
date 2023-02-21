package com.bcefit.projet.application.user;

import com.bcefit.projet.domain.user.GenreTvEntity;
import com.bcefit.projet.domain.user.GenreTvRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GenreTvApplicationService implements GenreTvApplicationServicePort {

    private GenreTvRepository genreTvRepository;

    public GenreTvApplicationService(GenreTvRepository genreTvRepository){
        this.genreTvRepository = genreTvRepository;
    }

    @Override
    public List<GenreTvEntity> getAllGenreTv(){return genreTvRepository.getAll();}

}
