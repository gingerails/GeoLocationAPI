package com.genpt.nsight.geolocationapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DistanceMatrixMapping {
    private String sourceZipCode;
    private String distanceUnit;
    private int radiusDistance;
    private int destinationZipCode;

}
