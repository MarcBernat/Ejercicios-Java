package edu.upc.eetac.dsa.ejerciciosjava.Texto;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 * Created by marc on 29/09/15.
 */
public abstract class Calculadora {
    public final static double average(String file) throws FileParsingException, BigNumbersException {
        //Variables

        double counter = 0d;
        double sum = 0d;

        BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = r.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    if (number > 1000)
                        throw new BigNumbersException("Number greater than 1000 at line " + (int) (++counter));
                    sum += number;
                    counter++;
                } catch (NumberFormatException e) {
                    throw new FileParsingException(e.getMessage());
                }
            }
        } catch (java.io.IOException e) {
            throw new FileParsingException(e.getMessage());
        } finally {
            try {
                r.close();
            } catch (IOException e) {
                System.err.println("warning: can not close file.");
            }
        }

        return sum / counter;
    }
}
