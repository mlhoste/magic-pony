package com.mlhoste.magicpony.repository;

import com.mlhoste.magicpony.entity.Pony;
import org.springframework.data.repository.CrudRepository;

public interface PonyRepository extends CrudRepository<Pony, Long> {
}
