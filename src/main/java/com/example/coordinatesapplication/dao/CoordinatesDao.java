package com.example.coordinatesapplication.dao;

import com.example.coordinatesapplication.model.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinatesDao extends JpaRepository<Coordinates, Long> {
}
