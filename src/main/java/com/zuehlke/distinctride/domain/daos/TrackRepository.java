package com.zuehlke.distinctride.domain.daos;

import com.zuehlke.distinctride.domain.models.Track;

import java.util.Optional;


public interface TrackRepository {

    Optional<Track> get(int trackId);

    void create(Track track);
}
