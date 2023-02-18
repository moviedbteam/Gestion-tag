package com.bcefit.projet.application.wish;


import com.bcefit.projet.domain.wish.WishMovieEntity;

import java.util.List;

public interface WishMovieApplicationServicePort {

    List<WishMovieEntity> getAllWishMovies();

    void addWishMovie(WishMovieEntity wishMovieEntity);

    void deleteWishMovie(WishMovieEntity wishMovieEntity);


}
