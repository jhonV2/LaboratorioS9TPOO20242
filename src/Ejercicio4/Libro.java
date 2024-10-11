/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author user
 */
import java.util.List;

public class Libro {
    private String titulo;
    private List<Capitulo> capitulos;

    public Libro(String titulo, List<Capitulo> capitulos) {
        this.titulo = titulo;
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Capitulo> getCapitulos() {
        return this.capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
}