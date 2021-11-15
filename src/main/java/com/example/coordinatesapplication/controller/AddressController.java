package com.example.coordinatesapplication.controller;

import com.example.coordinatesapplication.model.dto.AddressResponseDto;
import com.example.coordinatesapplication.service.AddressService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/addresses")
    public List<AddressResponseDto> getAllAddresses() throws Exception {
        return addressService.getAllAddresses();
    }
}
