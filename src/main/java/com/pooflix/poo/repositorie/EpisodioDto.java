package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Episodio;

public interface EpisodioDto extends CrudRepository<Episodio, Integer> {

}
