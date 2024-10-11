/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author user
 */
public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private Motor motor;

    public Coche(String marca, String modelo, int año, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
