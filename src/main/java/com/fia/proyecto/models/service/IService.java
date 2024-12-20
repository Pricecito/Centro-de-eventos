package com.fia.proyecto.models.service;

import java.util.List;
import java.util.Optional;

public interface IService <T>{
    List<T> findAll();
    Optional<T>findOne(Long id);
    T saveOrUpdate(T entity);
    void delete(Long id);
}
