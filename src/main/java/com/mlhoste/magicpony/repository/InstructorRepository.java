package com.mlhoste.magicpony.repository;

import com.mlhoste.magicpony.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
