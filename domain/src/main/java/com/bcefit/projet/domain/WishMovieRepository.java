package com.bcefit.projet.domain;


import java.util.List;

public interface WishMovieRepository {
    List<WishMovieEntity> getAll();

    void addWishMovie(WishMovieEntity wishMovieEntity) throws ResourceAlreadyExistsException;


    void deleteWishMovie(WishMovieEntity wishMovieEntity);
}
