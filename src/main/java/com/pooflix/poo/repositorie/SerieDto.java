package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Serie;

public interface SerieDto extends CrudRepository<Serie, Integer> {

}
