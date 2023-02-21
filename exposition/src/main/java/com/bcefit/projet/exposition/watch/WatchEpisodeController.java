package com.bcefit.projet.exposition.watch;

import com.bcefit.projet.application.watch.WatchEpisodeApplicationServicePort;
import com.bcefit.projet.domain.watch.WatchEpisodeEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WatchEpisodeController {

    private final WatchEpisodeApplicationServicePort watchEpisodeApplicationServicePort;

    public WatchEpisodeController(WatchEpisodeApplicationServicePort watchApplicationServicePort){
        this.watchEpisodeApplicationServicePort = watchApplicationServicePort;
    }
    @GetMapping(value = "/health-check-watchepisode")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }


    @GetMapping(value = "/watch/episodes")
    public ResponseEntity<List<WatchEpisodeDto>> getAllWatchEpisodesAPI(){
        // 1- Récuperer les listes des "tagEpisodeVus" entities depuis l'application service
        List<WatchEpisodeEntity> watchEpisodeEntityList = watchEpisodeApplicationServicePort.getAllWatchEpisodes();
        // 2- Mapper la liste des entitées -> liste de dto
        List<WatchEpisodeDto> watchEpisodeDTOS = WatchEpisodeMapper.mapToListDto(watchEpisodeEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(watchEpisodeDTOS, HttpStatus.OK);
    }

    @PostMapping(value ="/watch/episode")
    public ResponseEntity<String> CreateWatchEpisode(@RequestBody WatchEpisodeDtoLight watchEpisodeDtoLight){
        //1 Mapper la DTO vers l'entité WatchEpisode
        WatchEpisodeEntity watchEpisodeEntity = WatchEpisodeMapper.mapToEntity(watchEpisodeDtoLight);
        //2 Appleler le service d'insert
        watchEpisodeApplicationServicePort.addWatchEpisode(watchEpisodeEntity);

        return new ResponseEntity<>("Watch Episode created", HttpStatus.CREATED);
    }

    @DeleteMapping(value ="/watch/episode/{uid}")
    public ResponseEntity<String> deleteWatchEpisode(@PathVariable String uid)  {

        WatchEpisodeEntity watchEpisodeEntity = WatchEpisodeMapper.mapToEntity(uid);
        watchEpisodeApplicationServicePort.deleteWatchEpisode(watchEpisodeEntity);

        return new ResponseEntity<>("Watch Episode deleted", HttpStatus.OK);
    }
}
