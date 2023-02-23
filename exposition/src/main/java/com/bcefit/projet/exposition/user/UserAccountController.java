package com.bcefit.projet.exposition.user;

import com.bcefit.projet.application.user.UserAccountApplicationServicePort;
import com.bcefit.projet.domain.user.UserAccountEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserAccountController {

    private final UserAccountApplicationServicePort userAccountApplicationServicePort;

    public UserAccountController(UserAccountApplicationServicePort userAccountApplicationServicePort){
        this.userAccountApplicationServicePort = userAccountApplicationServicePort;
    }

    @GetMapping(value = "/helth-check-userAccount")
    public ResponseEntity<String> hello(){return new ResponseEntity<>("OK", HttpStatus.OK);}



    @GetMapping(value = "/user/{id}",produces = { "application/json" } )
    public UserAccountDto getUserAccountByIdAPI(@PathVariable final UUID id){

        UserAccountEntity userAccountEntity = userAccountApplicationServicePort.findById(id);
        return UserAccountMapper.mapToDto(userAccountEntity);
        }


    @GetMapping(value = "/users")
    public ResponseEntity<List<UserAccountDto>> getAllUsersAPI(){
        // 1- Récuperer les listes des "users" entities depuis l'application service
        List<UserAccountEntity> userAccountEntityList = userAccountApplicationServicePort.getAllUsers();
        // 2- Mapper la liste des entitées -> liste de dto
        List<UserAccountDto> genreMovieDtoList = UserAccountMapper.mapToListDto(userAccountEntityList);
        // 3- return la liste des dtos
        return new ResponseEntity<>(genreMovieDtoList, HttpStatus.OK);

    }

}
