package com.bcefit.projet.application;


import com.bcefit.projet.domain.WishMovieEntity;

import java.util.List;

public interface WishMovieApplicationServicePort {

    List<WishMovieEntity> getAllWishMovies();

    void addWishMovie(WishMovieEntity wishMovieEntity);

    void deleteWishMovie(WishMovieEntity wishMovieEntity);


}
