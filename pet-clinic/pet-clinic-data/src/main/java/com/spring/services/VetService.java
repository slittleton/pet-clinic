package com.spring.services;

import java.util.Set;

import com.spring.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
