package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Actor;

public interface ActorDto extends CrudRepository<Actor, Integer> {

}
