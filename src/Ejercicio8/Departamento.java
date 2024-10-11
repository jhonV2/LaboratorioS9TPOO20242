/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author user
 */
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre, List<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}