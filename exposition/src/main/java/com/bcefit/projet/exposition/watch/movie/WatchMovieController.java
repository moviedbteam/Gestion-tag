package com.bcefit.projet.exposition.watch.movie;


import com.bcefit.projet.application.watch.WatchMovieApplicationServicePort;
import com.bcefit.projet.domain.watch.WatchMovieEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WatchMovieController {

    private final WatchMovieApplicationServicePort watchMovieApplicationServicePort;

    public WatchMovieController(WatchMovieApplicationServicePort watchApplicationServicePort){
        this.watchMovieApplicationServicePort = watchApplicationServicePort;
    }
    @GetMapping(value = "/health-check-watch")
    public ResponseEntity<String> helloWatch(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }


    @GetMapping(value = "/watchlist/movies")
    public ResponseEntity<List<WatchMovieDto>> getAllWatchMoviesAPI(){
        // 1- Récuperer les liste des "tagMovieAVoir" entities depuis l'application service
        List<WatchMovieEntity> watchMovieEntities = watchMovieApplicationServicePort.getAllWatchMovies();
        // 2- Mapper la liste des entitées -> liste de dto
        List<WatchMovieDto> watchMovieDTOS = WatchMovieMapper.mapToListDto(watchMovieEntities);
        // 3- return la liste des dtos
        return new ResponseEntity<>(watchMovieDTOS, HttpStatus.OK);
    }

    @PostMapping(value ="/watchlist/movie")
    public ResponseEntity<String> CreateWatchMovie(@RequestBody WatchMovieDtoLight watchMovieDtoLight){
        //1 Mapper la DTO vers l'entité WatchMovie
        WatchMovieEntity watchMovieEntity = WatchMovieMapper.mapToEntity(watchMovieDtoLight);
        //2 Appleler le service d'insert
        watchMovieApplicationServicePort.addWatchMovie(watchMovieEntity);

        return new ResponseEntity<>("Watch Movie created", HttpStatus.CREATED);
    }

    @DeleteMapping(value ="/watchlist/movie/{uid}")
    public ResponseEntity<String> deleteWatchMovie(@PathVariable String uid)  {

        WatchMovieEntity watchMovieEntity = WatchMovieMapper.mapToEntity(uid);
        watchMovieApplicationServicePort.deleteWatchMovie(watchMovieEntity);

        return new ResponseEntity<>("Watch Movie deleted", HttpStatus.OK);
    }
}


