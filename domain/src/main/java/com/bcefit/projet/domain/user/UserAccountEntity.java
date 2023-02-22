package com.bcefit.projet.domain.user;

import java.util.List;
import java.util.UUID;

public class UserAccountEntity {


    private UUID idUser;

    private String userName;

    private String email;

    private Integer birthYear;

    private List<GenreMovieEntity> genreMovieList;

    private List<GenreTvEntity> genreTvList;

    private List<StreamingSubscriptionEntity> streamingSubscriptionList;

    private boolean adultContent;

    private boolean enableAccount;

    public UserAccountEntity(UUID idUser, String userName, String email, Integer birthYear, List<GenreMovieEntity> genreMovieList, List<GenreTvEntity> genreTvList, List<StreamingSubscriptionEntity> streamingSubscriptionList, boolean adultContent, boolean enableAccount) {
        this.idUser = idUser;
        this.userName = userName;
        this.email= email;
        this.birthYear = birthYear;
        this.genreMovieList = genreMovieList;
        this.genreTvList = genreTvList;
        this.streamingSubscriptionList = streamingSubscriptionList;
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

    public List<GenreMovieEntity> getGenreMovieList() {
        return this.genreMovieList;
    }

    public void setGenreMovieList(List<GenreMovieEntity> genreMovieList) {
        this.genreMovieList = genreMovieList;
    }

    public List<GenreTvEntity> getGenreTvList() {
        return this.genreTvList;
    }

    public void setGenreTvList(List<GenreTvEntity> genreTvList) {
        this.genreTvList = genreTvList;
    }

    public List<StreamingSubscriptionEntity> getStreamingSubscriptionList() {
        return streamingSubscriptionList;
    }

    public void setStreamingSubscriptionList(List<StreamingSubscriptionEntity> streamingSubscriptionList) {
        this.streamingSubscriptionList = streamingSubscriptionList;
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
