
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


INSERT INTO WISH_MOVIE (uid, id_user, id_movie, id_collection)
VALUES
    ('74465f46-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 1234, 5678),
    ('7446668a-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 5678, 1234),
    ('744673d2-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 2468, NULL);

INSERT INTO WISH_EPISODE (uid, id_user, id_episode, id_season, id_tv)
VALUES
    ('744677ce-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 1234, 1, 5678),
    ('74467d64-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 5678, 2, 1234),
    ('74469164-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 2468, 3, 91011);

INSERT INTO WATCH_MOVIE (uid, id_user, id_movie, id_collection, viewing_place, viewing_mood, viewing_rate)
VALUES
    ('7446a47e-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 1234, 5678, 'Home', 1, 4),
    ('7446a9f6-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 5678, 1234, 'Cinema', 2, 3),
    ('7446ae6a-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 2468, NULL, 'Home', 3, 5);

INSERT INTO WATCH_EPISODE (uid, id_user, id_episode, id_season, id_tv, viewing_place, viewing_mood, viewing_rate)
VALUES
    ('7446bd9c-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 1234, 1, 5678, 'Home', 1, 4),
    ('7446c36e-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 5678, 2, 1234, 'Cinema', 2, 3),
    ('7446c5e4-b366-11ed-afa1-0242ac120002', 'a44c7dfc-56c9-4a70-a6be-5ce5ca5b5d5d', 2468, 3, 91011, 'Home', 3, 5);


