package com.bcefit.projet.exposition.user;

import com.bcefit.projet.application.user.StreamingSubscriptionApplicationServicePort;
import com.bcefit.projet.domain.user.GenreMovieEntity;
import com.bcefit.projet.domain.user.StreamingSubscriptionEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StreamingSubscriptionController {

    private StreamingSubscriptionApplicationServicePort streamingSubscriptionApplicationServicePort;

    public StreamingSubscriptionController(StreamingSubscriptionApplicationServicePort streamingSubscriptionApplicationServicePort){
        this.streamingSubscriptionApplicationServicePort = streamingSubscriptionApplicationServicePort;
    }

    @GetMapping(value = "/health-check-streamingsubscription")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/streaming")
    public ResponseEntity<List<StreamingSubscriptionDto>> getAllStreamingSubscriptionAPI(){
        // 1- Récuperer les liste des "streaming subscription" entities depuis l'application service
        List<StreamingSubscriptionEntity> streamingSubscriptionEntityList = streamingSubscriptionApplicationServicePort.getAllStreamingSubscription();
        // 2- Mapper la liste des entitées -> liste de dto
        List<StreamingSubscriptionDto> streamingSubscriptionDtoList = StreamingSubscriptionMapper.mapToListDto(streamingSubscriptionEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(streamingSubscriptionDtoList, HttpStatus.OK);
    }
}
