package com.example.coordinatesapplication.service;

import com.example.coordinatesapplication.model.Coordinates;
import java.util.List;

public interface CoordinatesService {
    List<Coordinates> getByAddress(String houseNumber, String streetNumber, String city);

    List<Coordinates> getAllCoordinates();
}
