package com.bcefit.projet.exposition.user;


import java.util.List;
import java.util.UUID;

public class UserAccountDto {

    private UUID idUser;

    private String userName;

    private String Email;

    private Integer birthYear;

    //private List<GenreMovieDto> genreMovieList;

    //private List<GenreTvDto> genreTvList;

    //private List<StreamingSubscriptionDto> streamingSubscriptionList;

    private boolean adultContent;

    private boolean enableAccount;

    public UserAccountDto() {
    }

    public UserAccountDto(UUID idUser, String userName, String email, Integer birthYear, boolean adultContent, boolean enableAccount) {
        this.idUser = idUser;
        this.userName = userName;
        Email = email;
        this.birthYear = birthYear;
        this.adultContent = adultContent;
        this.enableAccount = enableAccount;
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getBirthYear() {
        return birthYear;
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
