package com.bcefit.projet.domain.watch;

import java.util.List;

public interface WatchEpisodeRepository {

    List<WatchEpisodeEntity> getAll();
    void addWatchEpisode(WatchEpisodeEntity watchEpisodeEntity);

    void deleteWatchEpisode(WatchEpisodeEntity watchEpisodeEntity);
}
