package com.example.coordinatesapplication.service;

import com.example.coordinatesapplication.model.dto.AddressResponseDto;
import java.util.List;

public interface AddressService {
    List<AddressResponseDto> getAllAddresses();
}
