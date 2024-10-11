/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author user
 */
import java.util.List;

public class Edificio {
    private String direccion;
    private List<Piso> pisos;

    public Edificio(String direccion, List<Piso> pisos) {
        this.direccion = direccion;
        this.pisos = pisos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Piso> getPisos() {
        return this.pisos;
    }

    public void setPisos(List<Piso> pisos) {
        this.pisos = pisos;
    }
}
