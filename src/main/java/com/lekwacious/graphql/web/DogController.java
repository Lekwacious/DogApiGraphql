package com.lekwacious.graphql.web;

import com.lekwacious.graphql.data.models.Dog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

//    private final DogService dogService;
//
//    public DogController(DogService dogService) {
//        this.dogService = dogService;
//    }
//
//    @GetMapping("/dogs")
//    public ResponseEntity<List<Dog>> getAllDogs() {
//        List<Dog> allDogs = dogService.getDogs();
//        return new ResponseEntity<>(allDogs, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}/breeds")
//    public ResponseEntity<String> getDogsBreedById(@PathVariable Long id) {
//        String breed = dogService.retrieveDogBreedById(id);
//        return new ResponseEntity<String>(breed, HttpStatus.OK);
//    }
//
//    @GetMapping("/dogs/names")
//    public ResponseEntity<List<String>> getDogsNames() {
//        List<String> dogNames = dogService.retrieveDogNames();
//        return new ResponseEntity<List<String>>(dogNames, HttpStatus.OK);
//    }
}

