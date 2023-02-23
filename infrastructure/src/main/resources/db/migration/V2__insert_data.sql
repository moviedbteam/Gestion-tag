INSERT INTO WISH_MOVIE (uid, id_user, id_movie, id_collection)
VALUES (1, 1, 100, 1),
       (2, 2, 200, 1),
       (3, 3, 150, 2),
       (4, 4, 175, 2),
       (5, 5, 125, 3),
       (6, 6, 225, 3),
       (7, 1, 135, 4),
       (8, 2, 235, 4),
       (9, 3, 180, 5),
       (10, 4, 190, 5),
       (11, 5, 210, 6),
       (12, 6, 220, 6);

INSERT INTO WISH_EPISODE (uid, id_user, id_episode, id_season, id_tv)
VALUES (123, 1, 10, 1, 100),
       (456, 2, 20, 2, 200),
       (789, 3, 30, 3, 300),
       (101, 4, 40, 4, 400),
       (112, 5, 50, 5, 500),
       (131, 6, 60, 6, 600),
       (141, 1, 70, 7, 700),
       (154, 2, 80, 8, 800),
       (165, 3, 90, 9, 900),
       (178, 4, 100, 10, 1000),
       (190, 5, 110, 11, 1100),
       (201, 6, 120, 12, 1200);

INSERT INTO WATCH_MOVIE (uid, id_user, id_movie, id_collection, viewing_place, viewing_mood, viewing_rate)
VALUES (231,3, 100, 1, 'Domicile', 5 ,1),
       (456 ,2, 200, 1, 'Cinéma', 2, 4),
       (789, 3, 150, 2, 'Cinéma', 3, 3),
       (01, 4, 175, 2, 'Cinéma', 1, 5),
       (12, 5, 125, 3, 'Cinéma', 2, 4),
       (31, 6, 225, 3, 'Domicile', 3, 3),
       (41, 1, 135, 4, 'Cinéma', 1, 5),
       (54, 2, 235, 4, 'Cinéma', 2, 4),
       (65, 3, 180, 5, 'Domicile', 3, 3),
       (78, 4, 190, 5, 'Cinéma', 1, 5),
       (90, 5, 210, 6, 'Cinéma', 2, 4),
       (201, 6, 220, 6, 'Cinéma', 3, 3);

INSERT INTO WATCH_EPISODE (uid, id_user, id_episode, id_season, id_tv, viewing_place, viewing_mood, viewing_rate)
VALUES (123, 1, 10, 1, 100, 'Domicile', 1, 5),
       (456, 2, 20, 2, 200, 'Domicile', 2, 4),
       (789, 3, 30, 3, 300, 'Domicile', 3, 3),
       (101, 4, 40, 4, 400, 'Domicile', 1, 5),
       (112, 5, 50, 5, 500, 'Domicile', 2, 4),
       (131, 6, 60, 6, 600, 'Domicile', 3, 3),
       (141, 1, 70, 7, 700, 'Domicile', 1, 5),
       (154, 2, 80, 8, 800, 'Domicile', 2, 4),
       (165, 3, 90, 9, 900, 'Domicile', 3, 3),
       (178, 4, 100, 10, 1000, 'Domicile', 1, 5),
       (190, 5, 110, 11, 1100, 'Domicile', 2, 4),
       (201, 6, 120, 12, 1200, 'Domicile', 3, 3);

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


INSERT INTO USER_ACCOUNT (id_user, user_name, email, birth_year, adult_content, enable_account)
VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 'johndoe', 'johndoe@example.com', 1985, false, true);

INSERT INTO USER_GENRE_MOVIE (id_user, id_genre_movie) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 9648);
INSERT INTO USER_GENRE_MOVIE (id_user, id_genre_movie) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 16);

INSERT INTO USER_GENRE_TV (id_user, id_genre_tv) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 10759);
INSERT INTO USER_GENRE_TV (id_user, id_genre_tv) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 10765);

INSERT INTO USER_STREAMING_SUBSCRIPTION (id_user, id_streaming_subscription) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 75);
INSERT INTO USER_STREAMING_SUBSCRIPTION (id_user, id_streaming_subscription) VALUES ('a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 60);
