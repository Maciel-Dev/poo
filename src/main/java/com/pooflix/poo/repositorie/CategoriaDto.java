package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Categoria;

public interface CategoriaDto extends CrudRepository<Categoria, Integer> {

}
