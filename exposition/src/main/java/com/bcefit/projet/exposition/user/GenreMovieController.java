package com.bcefit.projet.exposition.user;


import com.bcefit.projet.application.user.GenreMovieApplicationServicePort;
import com.bcefit.projet.domain.user.GenreMovieEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GenreMovieController {

        private GenreMovieApplicationServicePort genreMovieApplicationServicePort;

        public GenreMovieController(GenreMovieApplicationServicePort genreMovieApplicationServicePort){
            this.genreMovieApplicationServicePort = genreMovieApplicationServicePort;
        }

    @GetMapping(value = "/health-check-genremovie")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/genremovie/genres")
    public ResponseEntity<List<GenreMovieDto>> getAllGenreMovieAPI(){
        // 1- Récuperer les liste des "genre Movie" entities depuis l'application service
        List<GenreMovieEntity> genreMovieEntityList = genreMovieApplicationServicePort.getAllGenreMovie();
        // 2- Mapper la liste des entitées -> liste de dto
        List<GenreMovieDto> genreMovieDtoList = GenreMovieMapper.mapToListDto(genreMovieEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(genreMovieDtoList, HttpStatus.OK);
    }
}
