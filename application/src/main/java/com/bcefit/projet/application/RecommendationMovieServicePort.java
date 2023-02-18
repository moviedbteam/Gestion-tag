package com.bcefit.projet.application;

import com.bcefit.projet.domain.RecommendationMovieEntity;

import java.util.List;

public interface RecommendationMovieServicePort {

    List<RecommendationMovieEntity> getRecommentationsMovieByAPI();

    void saveRecommendedMovie(RecommendationMovieEntity recommendationMovieEntity);


}
