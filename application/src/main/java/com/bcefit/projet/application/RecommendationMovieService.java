package com.bcefit.projet.application;

import com.bcefit.projet.domain.RecommendationMovieEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
@Transactional
public class RecommendationMovieService implements RecommendationMovieServicePort {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<RecommendationMovieEntity> getRecommentationsMovieByAPI() {

        List<RecommendationMovieEntity> recommendationMovieEntityList = null;
        return recommendationMovieEntityList;
    }

    @Override
    public void saveRecommendedMovie(RecommendationMovieEntity recommendationMovieEntity) {

    }
}
