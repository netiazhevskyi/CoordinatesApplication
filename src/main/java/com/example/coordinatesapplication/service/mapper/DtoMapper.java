package com.example.coordinatesapplication.service.mapper;

public interface DtoMapper<D, T> {
    T toModel(D responseDto);

    D toDto(T model);
}
