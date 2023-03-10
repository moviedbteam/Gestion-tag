package com.bcefit.projet.exposition.watch;

public class WatchMovieDtoLight {


    private Integer idUser;

    private Integer idMovie;

    private Integer idCollection;

    // Cinéma, TV, illégale ou autre
    private String viewingPlace;

    // Note de 1 à 5
    private Integer viewingRate;

    // Nombre associé à des humeurs :
    // 1=Choqué, 2=Frustré, 3= Triste, 4=Songeur, 5=Emu, 6=Amusé, 7= Effrayé, 8=Las, 9=Compris, 10=Ravi, 11= Perdu, 12= Tendu
    private Integer viewingMood;


    public WatchMovieDtoLight() {
    }

    public WatchMovieDtoLight(Integer idUser, Integer idMovie, Integer idCollection, String viewingPlace, Integer viewingRate, Integer viewingMood) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
        this.viewingPlace = viewingPlace;
        this.viewingRate = viewingRate;
        this.viewingMood = viewingMood;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }

    public String getViewingPlace() {
        return viewingPlace;
    }

    public void setViewingPlace(String viewingPlace) {
        this.viewingPlace = viewingPlace;
    }

    public Integer getViewingRate() {
        return viewingRate;
    }

    public void setViewingRate(Integer viewingRate) {
        this.viewingRate = viewingRate;
    }

    public Integer getViewingMood() {
        return viewingMood;
    }

    public void setViewingMood(Integer viewingMood) {
        this.viewingMood = viewingMood;
    }
}

