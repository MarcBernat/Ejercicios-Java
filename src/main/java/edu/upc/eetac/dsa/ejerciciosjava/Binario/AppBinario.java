package edu.upc.eetac.dsa.ejerciciosjava.Binario;

import java.io.*;
import java.io.IOException;

/**
 * Created by marc on 29/09/15.
 */
public class AppBinario {
    public static void main(String[] args) throws IOException {
        Binario testWrite = new Binario(3, 7.5, 'a');
        testWrite.saveToFile("test-io-binary");

        Binario testRead = Binario.readFromFile("test-io-binary");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        File file = new File("test-io-binary");
        file.delete();
    }
}
