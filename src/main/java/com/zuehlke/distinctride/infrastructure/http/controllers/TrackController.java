package com.zuehlke.distinctride.infrastructure.http.controllers;

import static com.zuehlke.distinctride.infrastructure.boundaries.rest.TrackMapper.map;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.zuehlke.distinctride.domain.services.TrackService;
import com.zuehlke.distinctride.infrastructure.boundaries.rest.TrackMapper;
import com.zuehlke.distinctride.infrastructure.exceptions.TrackNotFoundException;
import com.zuehlke.distinctride.infrastructure.http.models.TrackRestEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/destinctride/tracks", produces = APPLICATION_JSON_VALUE)
public class TrackController {

    @Autowired
    private TrackService trackService;

    @GetMapping(value = "/{trackId}")
    public ResponseEntity<TrackRestEntity> get(@PathVariable Integer trackId) {
        return
            ResponseEntity.ok(
                trackService.get(trackId)
                    .map(TrackMapper::map)
                    .orElseThrow(
                        () -> new TrackNotFoundException()
                    )
            );
    }

    @PostMapping(value = "/tracks", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody TrackRestEntity track) {
        trackService.create(
            map(track)
        );
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
