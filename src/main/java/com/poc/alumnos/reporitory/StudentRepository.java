package com.poc.alumnos.reporitory;

import org.springframework.data.repository.CrudRepository;

import com.poc.alumnos.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
