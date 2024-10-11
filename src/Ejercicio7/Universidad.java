/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author user
 */
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
