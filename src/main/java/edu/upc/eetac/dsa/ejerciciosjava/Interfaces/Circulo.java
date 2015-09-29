package edu.upc.eetac.dsa.ejerciciosjava.Interfaces;

/**
 * Created by marc on 29/09/15.
 */
public class Circulo extends FormaAbstracta {
    double radio;

    public Circulo(String tipoForma, double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double area (){
        return Math.PI * radio * radio;
    }
}
