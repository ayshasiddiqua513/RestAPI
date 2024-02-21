package com.example.project_wf.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.project_wf.model.Pet;
import com.example.project_wf.service.PetService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class PetController {
    @Autowired
    PetService petService;

    @PostMapping("/pet")
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }
    // @PutMapping("pet/{id}")
    // public String putMethodName(@PathVariable Long id, @RequestBody Pet uPet) {
    //     Optional<Pet> existingPet = petService.getPetById(id);
    //     if (existingPet.isPresent()) {
    //         petService.savePet(uPet);
    //         return "Pet updated successfully";
    //     } else {
    //         return "Pet not found";
    //     }
    // }
    @PutMapping("/pet/{petId}")
    public Pet updatePet(@PathVariable Long petId, @RequestBody Pet updatedPet) {
    Optional<Pet> existingPetOptional = petService.getPetById(petId);
    
    if (existingPetOptional.isPresent()) {
        Pet existingPet = existingPetOptional.get();
        existingPet.setPetName(updatedPet.getPetName());
        existingPet.setPetType(updatedPet.getPetType());
        existingPet.setBreed(updatedPet.getBreed());
        existingPet.setGender(updatedPet.getGender());
        existingPet.setAge(updatedPet.getAge());
        existingPet.setLocation(updatedPet.getLocation());
        existingPet.setAdoptionFee(updatedPet.getAdoptionFee());
        
        return petService.addPet(existingPet);
    } else {
        throw new RuntimeException("Pet not found with id: " + petId);
    }
}

    @GetMapping("/pets")
    public List<Pet> getPets() {
        return petService.getPets();
    }

    @GetMapping("/pet/{petId}")
    public Optional<Pet> getPetById(@PathVariable Long petId) {
        return petService.getPetById(petId);
    }
     @DeleteMapping("/pet/{petId}")
    public ResponseEntity<String> deletePet(@PathVariable Long petId) {
        Optional<Pet> existingPetOptional = petService.getPetById(petId);
        
        if (existingPetOptional.isPresent()) {
            petService.deletePetById(petId);
            return ResponseEntity.ok("Pet with ID " + petId + " deleted successfully");
        } else {
            return ResponseEntity.notFound().build(); // If pet with given ID not found
        }
    }
}
