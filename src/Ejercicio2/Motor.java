/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author user
 */
public class Motor {
    private String tipo;
    private int caballosDeFuerza;

    public Motor(String tipo, int caballosDeFuerza) {
        this.tipo = tipo;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCaballosDeFuerza() {
        return this.caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
}
