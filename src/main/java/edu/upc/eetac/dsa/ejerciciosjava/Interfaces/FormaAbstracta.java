package edu.upc.eetac.dsa.ejerciciosjava.Interfaces;

/**
 * Created by marc on 29/09/15.
 */
public abstract class FormaAbstracta implements Formas {
    String TipoForma;
    /**Forma es una interface (contiene area) la cual la implementamos en Forma Abstracta.
     *
     * Creamos el constructor para crear la variable forma
     * **/
    public FormaAbstracta(String tipoForma) {
        TipoForma = tipoForma;
    }
}
