package com.spring.services;

import java.util.Set;


import com.spring.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
