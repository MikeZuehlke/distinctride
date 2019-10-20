package com.zuehlke.distinctride.domain.services;

import com.zuehlke.distinctride.domain.daos.TrackRepository;
import com.zuehlke.distinctride.domain.models.Track;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrackService {

    @Autowired
    private TrackRepository repo;

    public Optional<Track> get(Integer trackId) {
        return repo.get(trackId);
    }

    public void create(Track track) {
        repo.create(track);
    }
}