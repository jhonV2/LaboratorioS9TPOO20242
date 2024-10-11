/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author user
 */
public class CPU {
    private float velocidad;
    private int nucleos;

    public CPU(float velocidad, int nucleos) {
        this.velocidad = velocidad;
        this.nucleos = nucleos;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}