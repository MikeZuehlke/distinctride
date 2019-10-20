package com.zuehlke.distinctride.infrastructure.db.repos;

import static com.zuehlke.distinctride.infrastructure.boundaries.db.TrackMapper.map;

import com.zuehlke.distinctride.domain.models.Track;
import com.zuehlke.distinctride.infrastructure.boundaries.db.TrackMapper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TrackRepository implements com.zuehlke.distinctride.domain.daos.TrackRepository {

    @Autowired
    private TrackRepositoryJpa repo;

    @Override
    public Optional<Track> get(int trackId) {
        return repo.findById(trackId)
            .map(TrackMapper::map);
    }

    @Override
    public void create(Track track) {
        repo.save(map(track));
    }
}
