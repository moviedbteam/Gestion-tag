create table WISH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    id_user INTEGER,
    id_movie INTEGER,
    id_collection INTEGER,
    PRIMARY KEY (uid)
);
create table WISH_EPISODE
(
    uid VARCHAR(50) NOT NULL,
    id_user INTEGER,
    id_episode INTEGER,
    id_season INTEGER,
    id_tv INTEGER,
    PRIMARY KEY (uid)
);
create table WATCH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    id_user INTEGER,
    id_movie INTEGER,
    id_collection INTEGER,
    viewing_place VARCHAR(50),
    viewing_mood INTEGER,
    viewing_rate INTEGER,
    PRIMARY KEY (uid)
);

create table WATCH_EPISODE
(
    uid VARCHAR(50) NOT NULL,
    id_user INTEGER,
    id_episode INTEGER,
    id_season INTEGER,
    id_tv INTEGER,
    viewing_place VARCHAR(50),
    viewing_mood INTEGER,
    viewing_rate INTEGER,
    PRIMARY KEY (uid)
);

create table GENRE_MOVIE
(
    id INTEGER NOT NULL,
    name VARCHAR(50),
    PRIMARY KEY (id)
);

create table GENRE_TV
(
    id INTEGER NOT NULL,
    name VARCHAR(50),
    PRIMARY KEY (id)
);

create table STREAMING_SUBSCRIPTION
(
    id INTEGER NOT NULL,
    name VARCHAR(50),
    PRIMARY KEY (id)
);