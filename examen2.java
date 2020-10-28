import java.io.*;

import java.util.Random;
import java.util.Scanner;

public class examen2 {

    public static void main(string args[]) {
        Scanner lector = new Scanner(system.in);

        double salario;

        system.out.printl("ingrese el salario del profesor: ");
        salario = lector.nextDouble();

        if (salario >= 50 && salario <= 100){
            salario += (salario * 0.10);

        }

        else if (salario > 101 && salario <= 150){
            salario += (salario * 0.050);

        }
        else if (salario > 151){
            salario = salario + (saalrio * 0.80);

        system.out.printl("el nuevo salario es: "+salario);

        }
    }

}

