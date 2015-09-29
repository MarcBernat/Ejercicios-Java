package edu.upc.eetac.dsa.ejerciciosjava.Interfaces;

public class AppInterface
{
    public static void main( String[] args ) {
        Formas[] formas = new Formas[2];
        formas[0] = new Circulo(null, 2.5);
        formas[1] = new Rectangulo(null, 3, 5);

        for (Formas shape : formas)
            System.out.println(shape + " with area = " + shape.area());
    }

}

