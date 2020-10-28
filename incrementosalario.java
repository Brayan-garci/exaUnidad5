import java.io.*;

public class incrementosalario {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int anhos;
		double salario;
		int x;
		System.out.println("dame salario");
		salario = Double.parseDouble(bufEntrada.readLine());
		System.out.println("A cuantos anhos deseas realizar el calculo");
		anhos = Integer.parseInt(bufEntrada.readLine());
		x = 1;
		while (x<=anhos) {
			salario = salario+(salario*.10);
			System.out.println("El salario en el anho "+x+"es de: "+salario);
			x = x+1;
		}
	}


}
