package com.bcefit.projet.exposition.user;

import java.util.List;

public class GenreMovieListDto {
    
    private List<GenreMovieDto> genreMovieDtoList;

    public GenreMovieListDto() {
    }

    public GenreMovieListDto(List<GenreMovieDto> genreMovieDtoList) {
        this.genreMovieDtoList = genreMovieDtoList;
    }

    public List<GenreMovieDto> getGenreMovieDtoList() {
        return genreMovieDtoList;
    }

    public void setGenreMovieDtoList(List<GenreMovieDto> genreMovieDtoList) {
        this.genreMovieDtoList = genreMovieDtoList;
    }
}
