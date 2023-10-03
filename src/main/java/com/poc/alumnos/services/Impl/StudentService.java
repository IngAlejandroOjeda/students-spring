package com.poc.alumnos.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.alumnos.entities.Student;
import com.poc.alumnos.reporitory.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository alumnoRepository;

    public Iterable<Student> obtenerTodosLosAlumnos() {
        return alumnoRepository.findAll();
    }

    public Student obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public Student crearAlumno(Student alumno) {
        return alumnoRepository.save(alumno);
    }

    public Student actualizarAlumno(Long id, Student alumno) {
        if (alumnoRepository.existsById(id)) {
            alumno.setId(id);
            return alumnoRepository.save(alumno);
        }
        return null;
    }

    public void eliminarAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }
}
