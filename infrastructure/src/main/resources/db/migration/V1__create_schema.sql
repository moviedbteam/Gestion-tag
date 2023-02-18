create table WISH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    id_user VARCHAR(100),
    id_movie VARCHAR(100),
    id_collection VARCHAR(100),
    PRIMARY KEY (uid)
);
create table WISH_EPISODE
(
    uid VARCHAR(50) NOT NULL,
    id_user VARCHAR(100),
    id_episode VARCHAR(100),
    id_serie VARCHAR(100),
    id_tv VARCHAR(100),
    PRIMARY KEY (uid)
);
create table WATCH_MOVIE
(
    uid VARCHAR(50) NOT NULL,
    id_user VARCHAR(100),
    id_movie VARCHAR(100),
    id_collection VARCHAR(100),
    viewing_place VARCHAR(25),
    viewing_mood INT,
    viewing_rate INT,
    PRIMARY KEY (uid)
);