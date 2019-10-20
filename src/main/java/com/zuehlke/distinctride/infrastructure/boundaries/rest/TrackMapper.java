package com.zuehlke.distinctride.infrastructure.boundaries.rest;

import com.zuehlke.distinctride.domain.models.Track;
import com.zuehlke.distinctride.domain.services.PolylineEncoder;
import com.zuehlke.distinctride.infrastructure.http.models.TrackRestEntity;


public class TrackMapper {

    public static TrackRestEntity map(Track track) {
        TrackRestEntity x = new TrackRestEntity();
        x.setId(track.getId());
        x.setName(track.getName());
        x.setPolyline(PolylineEncoder.encode(track.getPolyline()));
        return x;
    }

    public static Track map(TrackRestEntity track) {
        Track x = new Track();
        x.setId(track.getId());
        x.setName(track.getName());
        x.setPolyline(PolylineEncoder.decode(track.getPolyline()));
        return x;
    }
}