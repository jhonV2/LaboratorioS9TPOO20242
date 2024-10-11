/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author user
 */
public class Proyecto {
    private String nombre;
    private float presupuesto;

    public Proyecto(String nombre, float presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
}