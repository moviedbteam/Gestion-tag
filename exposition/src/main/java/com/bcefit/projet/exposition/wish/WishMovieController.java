package com.bcefit.projet.exposition.wish;


import com.bcefit.projet.application.wish.WishMovieApplicationServicePort;
import com.bcefit.projet.domain.wish.WishMovieEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WishMovieController {

    private final WishMovieApplicationServicePort wishMovieApplicationServicePort;

    public WishMovieController(WishMovieApplicationServicePort wishApplicationServicePort){
        this.wishMovieApplicationServicePort = wishApplicationServicePort;
    }
    @GetMapping(value = "/health-check-wish")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }


    @GetMapping(value = "/wishlist/movies")
    public ResponseEntity<List<WishMovieDto>> getAllWishMoviesAPI(){
        // 1- Récuperer les liste des "tagMovieAVoir" entities depuis l'application service
        List<WishMovieEntity> wishMovieEntities = wishMovieApplicationServicePort.getAllWishMovies();
        // 2- Mapper la liste des entitées -> liste de dto
        List<WishMovieDto> wishMovieDTOS = WishMovieMapper.mapToListDto(wishMovieEntities);
        // 3- return la liste des dtos
        return new ResponseEntity<>(wishMovieDTOS, HttpStatus.OK);
    }

    @PostMapping(value ="/wishlist/movie")
    public ResponseEntity<String> CreateWishMovie(@RequestBody WishMovieDtoLight wishMovieDtoLight){
        //1 Mapper la DTO vers l'entité WishMovie
        WishMovieEntity wishMovieEntity = WishMovieMapper.mapToEntity(wishMovieDtoLight);
        //2 Appleler le service d'insert
        wishMovieApplicationServicePort.addWishMovie(wishMovieEntity);

        return new ResponseEntity<>("Wish Movie created", HttpStatus.CREATED);
    }

    @DeleteMapping(value ="/wishlist/movie/{uid}")
    public ResponseEntity<String> deleteWishMovie(@PathVariable String uid)  {

        WishMovieEntity wishMovieEntity = WishMovieMapper.mapToEntity(uid);
        wishMovieApplicationServicePort.deleteWishMovie(wishMovieEntity);

        return new ResponseEntity<>("Wish Movie deleted", HttpStatus.OK);
    }
}


