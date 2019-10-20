package com.zuehlke.distinctride.infrastructure.boundaries.db;

import com.zuehlke.distinctride.domain.models.Track;
import com.zuehlke.distinctride.domain.services.PolylineEncoder;
import com.zuehlke.distinctride.infrastructure.db.entities.TrackDbEntity;


public class TrackMapper {

    public static TrackDbEntity map(Track track) {
        TrackDbEntity x = new TrackDbEntity();
        x.setId(track.getId());
        x.setName(track.getName());
        x.setPolyline(PolylineEncoder.encode(track.getPolyline()));
        return x;
    }

    public static Track map(TrackDbEntity track) {
        Track x = new Track();
        x.setId(track.getId());
        x.setName(track.getName());
        x.setPolyline(PolylineEncoder.decode(track.getPolyline()));
        return x;
    }
}
