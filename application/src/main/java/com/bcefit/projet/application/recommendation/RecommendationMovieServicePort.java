package com.bcefit.projet.application.recommendation;

import com.bcefit.projet.domain.recommendation.RecommendationMovieEntity;

import java.util.List;

public interface RecommendationMovieServicePort {

    List<RecommendationMovieEntity> getRecommentationsMovieByAPI();

    void saveRecommendedMovie(RecommendationMovieEntity recommendationMovieEntity);


}
