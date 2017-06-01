package com.mlhoste.magicpony.repository;

import com.mlhoste.magicpony.entity.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session, Long> {
}
