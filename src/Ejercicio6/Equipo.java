/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author user
 */
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}