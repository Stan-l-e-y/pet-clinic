package ca.gbc.services;

import ca.gbc.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> FindAll();
}
