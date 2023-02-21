package com.bcefit.projet.exposition.user;

public class GenreMovieDto {

    private int id;
    private String name;

    public GenreMovieDto() {
    }

    public GenreMovieDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
