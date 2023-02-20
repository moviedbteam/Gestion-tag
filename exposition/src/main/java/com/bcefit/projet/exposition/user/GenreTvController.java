package com.bcefit.projet.exposition.user;

import com.bcefit.projet.application.user.GenreTvApplicationServicePort;
import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.GenreTvEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GenreTvController {

        private GenreTvApplicationServicePort genreTvApplicationServicePort;

        public GenreTvController(GenreTvApplicationServicePort genreTvApplicationServicePort){
            this.genreTvApplicationServicePort = genreTvApplicationServicePort;
        }

    @GetMapping(value = "/health-check-genretv")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/genre/tv")
    public ResponseEntity<List<GenreTvDto>> getAllGenreTvAPI(){
        // 1- Récuperer les liste des "genre TV" entities depuis l'application service
        List<GenreTvEntity> genreTvEntityList = genreTvApplicationServicePort.getAllGenreTv();
        // 2- Mapper la liste des entitées -> liste de dto
        List<GenreTvDto> genreTvDtoList = GenreTvMapper.matToListDto(genreTvEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(genreTvDtoList, HttpStatus.OK);
    }
}
