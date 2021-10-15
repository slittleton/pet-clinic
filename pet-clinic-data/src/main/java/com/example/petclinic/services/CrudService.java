package com.example.petclinic.services;

import java.util.Set;
// mimics spring data repository crud services
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);



}
