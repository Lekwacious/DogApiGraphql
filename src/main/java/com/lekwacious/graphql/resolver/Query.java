package com.lekwacious.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lekwacious.graphql.data.models.Dog;
import com.lekwacious.graphql.data.repository.DogRepository;
import com.lekwacious.graphql.exception.DogNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }
    public Iterable<Dog> findAllDogs(){
        return dogRepository.findAll();
    }
    public Dog findDogById(Long id){
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if(optionalDog.isPresent()){
            return optionalDog.get();
        }
        else {
            throw new DogNotFoundException("Dog not found", id);
        }
    }
}
