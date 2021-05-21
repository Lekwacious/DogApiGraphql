package com.lekwacious.graphql.data.repository;

import com.lekwacious.graphql.data.models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {



}
