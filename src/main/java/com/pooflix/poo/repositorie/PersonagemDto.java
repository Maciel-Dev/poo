package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Personagem;

public interface PersonagemDto extends CrudRepository<Personagem, String> {

}
