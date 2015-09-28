package edu.upc.eetac.dsa.ejerciciosjava.Constructores;

/**
 * Created by marc on 28/09/15.
 */
public class Tree {
    /** Creamos dos variables para los metros y el nombre */
    String nombre;
    int metros;

    public Tree() {}

    public Tree(String nombre) {
        this.nombre = nombre;
    }

    public Tree(int metros) {
        this.metros = metros;
    }
    public Tree(int metros, String nombre) {
        this.metros = metros;
        this.nombre = nombre;
    }
}