package com.example.project_wf.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project_wf.model.Pet;
import com.example.project_wf.repository.PetRepo;

@Service
public class PetService {
    @Autowired
    PetRepo petRepo;

    public Pet addPet(Pet pet) {
        return petRepo.save(pet);
    }

    public List<Pet> getPets() {
        return petRepo.findAll();
    }

    public Optional<Pet> getPetById(Long id) {
        return petRepo.findById(id);
    }

    // PetRepo petRepo;

    public Pet savePet(Pet pet) {
        return petRepo.save(pet);
    }

    public List<Pet> findAllPets() {
        return petRepo.findAll();
    }

    public Optional<Pet> findPetById(Long id) {
        return petRepo.findById(id);
    }

    public Pet editPet(Long id, Pet uPet) {
        Pet pet = petRepo.findById(id).orElse(null);
        if (pet != null) {
            pet.setPetName(uPet.getPetName());
            pet.setPetType(uPet.getPetType());
            pet.setBreed(uPet.getBreed());
            pet.setGender(uPet.getGender());
            pet.setAge(uPet.getAge());
            pet.setLocation(uPet.getLocation());
            pet.setAdoptionFee(uPet.getAdoptionFee());
            return petRepo.saveAndFlush(pet);
        } else {
            return null;
        }
    }

    public String deletePet(Long id) {
        petRepo.deleteById(id);
        return "Pet deleted";
    }
    public void deletePetById(Long id) {
        petRepo.deleteById(id);
    }
}