/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author user
 */
public class Ordenador {
    private String marca;
    private String modelo;
    private CPU cpu;

    public Ordenador(String marca, String modelo, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
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

    public CPU getCpu() {
        return this.cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}