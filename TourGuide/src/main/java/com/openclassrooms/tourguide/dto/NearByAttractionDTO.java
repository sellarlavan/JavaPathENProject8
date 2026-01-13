package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NearByAttractionDTO {

    public String attractionName;
    public Location attractionLocation;
    public Location userLocation;
    public double distance;
    public int rewardPoints;

}
