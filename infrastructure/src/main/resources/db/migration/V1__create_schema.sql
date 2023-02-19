create table WISH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    idUser VARCHAR(100),
    idMovie VARCHAR(100),
    idCollection VARCHAR(100),
    PRIMARY KEY (uid)
);
create table WISH_EPISODE
(
    uid VARCHAR(50) NOT NULL,
    idUser VARCHAR(100),
    idEpisode VARCHAR(100),
    idSeason VARCHAR(100),
    idTv VARCHAR(100),
    PRIMARY KEY (uid)
);
create table WATCH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    idUser VARCHAR(100),
    idMovie VARCHAR(100),
    idCollection VARCHAR(100),
    viewingPlace VARCHAR(25),
    viewingMood INT,
    viewingRate INT,
    PRIMARY KEY (uid)
);