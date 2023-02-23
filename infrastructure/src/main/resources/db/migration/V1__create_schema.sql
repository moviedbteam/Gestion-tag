create table WISH_MOVIE
(
    uid UUID NOT NULL,
    id_user UUID,
    id_movie INTEGER,
    id_collection INTEGER,
    PRIMARY KEY (uid)
);
create table WISH_EPISODE
(
    uid UUID NOT NULL,
    id_user UUID,
    id_episode INTEGER,
    id_season INTEGER,
    id_tv INTEGER,
    PRIMARY KEY (uid)
);
create table WATCH_MOVIE
(
    uid UUID NOT NULL,
    id_user UUID,
    id_movie INTEGER,
    id_collection INTEGER,
    viewing_place VARCHAR(50),
    viewing_mood INTEGER,
    viewing_rate INTEGER,
    PRIMARY KEY (uid)
);

create table WATCH_EPISODE
(
    uid UUID NOT NULL,
    id_user UUID,
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
CREATE TABLE USER_ACCOUNT (
                              id_user UUID PRIMARY KEY,
                              user_name VARCHAR(255) NOT NULL,
                              email VARCHAR(255) NOT NULL,
                              birth_year INT,
                              adult_content BOOLEAN NOT NULL,
                              enable_account BOOLEAN NOT NULL
);
CREATE TABLE USER_GENRE_MOVIE (
                                  id_user UUID NOT NULL,
                                  id_genre_movie INT NOT NULL,
                                  PRIMARY KEY (id_user, id_genre_movie),
                                  FOREIGN KEY (id_user) REFERENCES USER_ACCOUNT (id_user)
);

CREATE TABLE USER_GENRE_TV (
                               id_user UUID NOT NULL,
                               id_genre_tv INT NOT NULL,
                               PRIMARY KEY (id_user, id_genre_tv),
                               FOREIGN KEY (id_user) REFERENCES USER_ACCOUNT (id_user)
);

CREATE TABLE USER_STREAMING_SUBSCRIPTION (
                                             id_user UUID NOT NULL,
                                             id_streaming_subscription INT NOT NULL,
                                             PRIMARY KEY (id_user, id_streaming_subscription),
                                             FOREIGN KEY (id_user) REFERENCES USER_ACCOUNT (id_user)
);