INSERT INTO WISH_MOVIE (uid, id_user, id_movie, id_collection)
VALUES ('uid_001', 1, 100, 1),
       ('uid_002', 2, 200, 1),
       ('uid_003', 3, 150, 2),
       ('uid_004', 4, 175, 2),
       ('uid_005', 5, 125, 3),
       ('uid_006', 6, 225, 3),
       ('uid_007', 1, 135, 4),
       ('uid_008', 2, 235, 4),
       ('uid_009', 3, 180, 5),
       ('uid_010', 4, 190, 5),
       ('uid_011', 5, 210, 6),
       ('uid_012', 6, 220, 6);

INSERT INTO WISH_EPISODE (uid, id_user, id_episode, id_season, id_tv)
VALUES ('epi123', 1, 10, 1, 100),
       ('epi456', 2, 20, 2, 200),
       ('epi789', 3, 30, 3, 300),
       ('epi101', 4, 40, 4, 400),
       ('epi112', 5, 50, 5, 500),
       ('epi131', 6, 60, 6, 600),
       ('epi141', 1, 70, 7, 700),
       ('epi154', 2, 80, 8, 800),
       ('epi165', 3, 90, 9, 900),
       ('epi178', 4, 100, 10, 1000),
       ('epi190', 5, 110, 11, 1100),
       ('epi201', 6, 120, 12, 1200);

INSERT INTO WATCH_MOVIE (uid, id_user, id_movie, id_collection, viewing_place, viewing_mood, viewing_rate)
VALUES ('watch123', 1, 100, 1, 1, 1, 5),
       ('watch456', 2, 200, 1, 2, 2, 4),
       ('watch789', 3, 150, 2, 1, 3, 3),
       ('watch101', 4, 175, 2, 2, 1, 5),
       ('watch112', 5, 125, 3, 3, 2, 4),
       ('watch131', 6, 225, 3, 1, 3, 3),
       ('watch141', 1, 135, 4, 2, 1, 5),
       ('watch154', 2, 235, 4, 3, 2, 4),
       ('watch165', 3, 180, 5, 1, 3, 3),
       ('watch178', 4, 190, 5, 2, 1, 5),
       ('watch190', 5, 210, 6, 3, 2, 4),
       ('watch201', 6, 220, 6, 1, 3, 3);

INSERT INTO WATCH_EPISODE (uid, id_user, id_episode, id_season, id_tv, viewing_place, viewing_mood, viewing_rate)
VALUES ('watchep123', 1, 10, 1, 100, 1, 1, 5),
       ('watchep456', 2, 20, 2, 200, 2, 2, 4),
       ('watchep789', 3, 30, 3, 300, 1, 3, 3),
       ('watchep101', 4, 40, 4, 400, 2, 1, 5),
       ('watchep112', 5, 50, 5, 500, 3, 2, 4),
       ('watchep131', 6, 60, 6, 600, 1, 3, 3),
       ('watchep141', 1, 70, 7, 700, 2, 1, 5),
       ('watchep154', 2, 80, 8, 800, 3, 2, 4),
       ('watchep165', 3, 90, 9, 900, 1, 3, 3),
       ('watchep178', 4, 100, 10, 1000, 2, 1, 5),
       ('watchep190', 5, 110, 11, 1100, 3, 2, 4),
       ('watchep201', 6, 120, 12, 1200, 1, 3, 3);

insert into GENRE_MOVIE(id, name) values(28,'Action');
insert into GENRE_MOVIE(id, name) values(12,'Aventure');
insert into GENRE_MOVIE(id, name) values(16,'Animation');
insert into GENRE_MOVIE(id, name) values(35,'Comédie');
insert into GENRE_MOVIE(id, name) values(80,'Crime');
insert into GENRE_MOVIE(id, name) values(99,'Documentaire');
insert into GENRE_MOVIE(id, name) values(18,'Drame');
insert into GENRE_MOVIE(id, name) values(10751,'Familial');
insert into GENRE_MOVIE(id, name) values(14,'Fantastique');
insert into GENRE_MOVIE(id, name) values(36,'Histoire');
insert into GENRE_MOVIE(id, name) values(27,'Horreur');
insert into GENRE_MOVIE(id, name) values(10402,'Musique');
insert into GENRE_MOVIE(id, name) values(9648,'Mystère');
insert into GENRE_MOVIE(id, name) values(10749,'Romance');
insert into GENRE_MOVIE(id, name) values(878,'Science-Fiction');
insert into GENRE_MOVIE(id, name) values(10770,'Téléfilm');
insert into GENRE_MOVIE(id, name) values(53,'Thriller');
insert into GENRE_MOVIE(id, name) values(10752,'Guerre');
insert into GENRE_MOVIE(id, name) values(37,'Western');

INSERT INTO GENRE_TV (id, name)
VALUES
    (10759, 'Action & Adventure'),
    (16, 'Animation'),
    (35, 'Comédie'),
    (80, 'Crime'),
    (99, 'Documentaire'),
    (18, 'Drame'),
    (10751, 'Familial'),
    (10762, 'Kids'),
    (9648, 'Mystère'),
    (10763, 'News'),
    (10764, 'Reality'),
    (10765, 'Science-Fiction & Fantastique'),
    (10766, 'Soap'),
    (10767, 'Talk'),
    (10768, 'War & Politics'),
    (37, 'Western');

