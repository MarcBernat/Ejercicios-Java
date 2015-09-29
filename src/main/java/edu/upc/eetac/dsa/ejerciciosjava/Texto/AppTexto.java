package edu.upc.eetac.dsa.ejerciciosjava.Texto;

public class AppTexto
{
    public static void main( String[] args ) {
    if (args.length != 1) {
            System.out.println("Program needs the path to the file with the numbers");
            System.exit(-1);
        }

        try {
            double average = Calculadora.average("/home/marc/Documentos/DSA/ejerciciosjava/src/main/java/edu/upc/eetac/dsa/ejerciciosjava/Texto/Num.txt");
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumbersException e) {
            e.printStackTrace();
        }
    }

}

