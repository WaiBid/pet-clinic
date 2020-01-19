package com.wc.petclinic.services;

import com.wc.petclinic.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Pet findAll();
}
