package edu.upc.eetac.dsa.ejerciciosjava.Texto;

public class AppTexto
{
    /**
     * Colocar Path /home/marc/Documentos/DSA/ejerciciosjava/src/main/java/edu/upc/eetac/dsa/ejerciciosjava/Texto/Num.txt
     */
    public static void main( String[] args ) {
        try {
            double average = Calculadora.average(args[0]);
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumbersException e) {
            e.printStackTrace();
        }
    }

}

