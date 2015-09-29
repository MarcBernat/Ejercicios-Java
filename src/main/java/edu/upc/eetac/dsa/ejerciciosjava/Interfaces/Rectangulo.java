package edu.upc.eetac.dsa.ejerciciosjava.Interfaces;

/**
 * Created by marc on 29/09/15.
 */
public class Rectangulo extends FormaAbstracta {
    int alto;
    int ancho;

    public Rectangulo(String tipoForma, int alto, int ancho) {
        super("Rectangulo");
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return alto * ancho;
    }
}
