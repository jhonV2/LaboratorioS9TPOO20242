/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author user
 */
public class Piso {
    private int numero;
    private float superficie;

    public Piso(int numero, float superficie) {
        this.numero = numero;
        this.superficie = superficie;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
}