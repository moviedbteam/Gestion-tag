package com.bcefit.projet.exposition.wish;

import com.bcefit.projet.application.wish.WishEpisodeApplicationServicePort;
import com.bcefit.projet.domain.wish.WishEpisodeEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WishEpisodeController {

    private final WishEpisodeApplicationServicePort wishEpisodeApplicationServicePort;

    public WishEpisodeController(WishEpisodeApplicationServicePort wishApplicationServicePort){
        this.wishEpisodeApplicationServicePort = wishApplicationServicePort;
    }
    @GetMapping(value = "//ep")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }


    @GetMapping(value = "/wish/episodes")
    public ResponseEntity<List<WishEpisodeDto>> getAllWishEpisodesAPI(){
        // 1- Récuperer les liste des "tagEpisodeAVoir" entities depuis l'application service
        List<WishEpisodeEntity> wishEpisodeEntityList = wishEpisodeApplicationServicePort.getAllWishEpisodes();
        // 2- Mapper la liste des entitées -> liste de dto
        List<WishEpisodeDto> wishEpisodeDTOS = WishEpisodeMapper.mapToListDto(wishEpisodeEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(wishEpisodeDTOS, HttpStatus.OK);
    }

    @PostMapping(value ="/wish/episode")
    public ResponseEntity<String> CreateWishEpisode(@RequestBody WishEpisodeDtoLight wishEpisodeDtoLight){
        //1 Mapper la DTO vers l'entité WishEpisode
        WishEpisodeEntity wishEpisodeEntity = WishEpisodeMapper.mapToEntity(wishEpisodeDtoLight);
        //2 Appleler le service d'insert
        wishEpisodeApplicationServicePort.addWishEpisode(wishEpisodeEntity);

        return new ResponseEntity<>("Wish Episode created", HttpStatus.CREATED);
    }

    @DeleteMapping(value ="/wish/episode/{uid}")
    public ResponseEntity<String> deleteWishEpisode(@PathVariable String uid)  {

        WishEpisodeEntity wishEpisodeEntity = WishEpisodeMapper.mapToEntity(uid);
        wishEpisodeApplicationServicePort.deleteWishEpisode(wishEpisodeEntity);

        return new ResponseEntity<>("Wish Episode deleted", HttpStatus.OK);
    }
}
