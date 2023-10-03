package com.poc.alumnos.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.alumnos.entities.Student;
import com.poc.alumnos.services.Impl.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
    
    @Autowired
    private StudentService alumnoService;

    @GetMapping
    public Iterable<Student> obtenerTodosLosAlumnos() {
        return alumnoService.obtenerTodosLosAlumnos();
    }

    @GetMapping("/{id}")
    public Student obtenerAlumnoPorId(@PathVariable Long id) {
        return alumnoService.obtenerAlumnoPorId(id);
    }

    @PostMapping
    public Student crearAlumno(@RequestBody Student alumno) {
        return alumnoService.crearAlumno(alumno);
    }

    @PutMapping("/{id}")
    public Student actualizarAlumno(@PathVariable Long id, @RequestBody Student alumno) {
        return alumnoService.actualizarAlumno(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable Long id) {
        alumnoService.eliminarAlumno(id);
    }
}
