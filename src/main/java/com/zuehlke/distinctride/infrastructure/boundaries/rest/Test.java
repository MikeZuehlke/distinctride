package com.zuehlke.distinctride.infrastructure.boundaries.rest;


import com.zuehlke.distinctride.domain.models.LatLng;
import com.zuehlke.distinctride.domain.services.PolylineEncoder;

import java.util.Arrays;
import java.util.List;


public class Test {

    public static void main(String[] args) {

        List<LatLng> polyline = Arrays.asList(
            new LatLng(38.5, -120.2),
            new LatLng(40.7, -120.95),
            new LatLng(43.252, -126.453)
        );
        System.out.println(PolylineEncoder.encode(polyline));

        System.out.println(PolylineEncoder.decode("_p~iF~ps|U_ulLnnqC_mqNvxq`@"));
    }
}
