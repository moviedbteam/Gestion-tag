package com.bcefit.projet.domain.user;

import java.util.*;

public class UserAccountEntity {


    private UUID idUser;

    private String userName;

    private String email;

    private Integer birthYear;

    //private Set<GenreMovieEntity> genreMovieSet;

    //private Set<GenreTvEntity> genreTvSet;

    //private Set<StreamingSubscriptionEntity> streamingSubscriptionSet;

    private boolean adultContent;

    private boolean enableAccount;

    public UserAccountEntity(UUID idUser, String userName, String email, Integer birthYear, boolean adultContent, boolean enableAccount) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.birthYear = birthYear;
        this.adultContent = adultContent;
        this.enableAccount = enableAccount;
    }

    public UserAccountEntity() {

    }

    public UUID getIdUser() {
        return this.idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }


    public boolean isAdultContent() {
        return adultContent;
    }

    public void setAdultContent(boolean adultContent) {
        this.adultContent = adultContent;
    }

    public boolean isEnableAccount() {
        return enableAccount;
    }

    public void setEnableAccount(boolean enableAccount) {
        this.enableAccount = enableAccount;
    }
}
