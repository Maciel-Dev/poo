package com.pooflix.poo.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.pooflix.poo.models.Performance;

public interface PerformanceDto extends CrudRepository<Performance, Long> {

}
