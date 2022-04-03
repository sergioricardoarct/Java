package JavaEstudos;

import java.util.Locale;
import java.util.Scanner;

public class ConversorString {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner Entrada = new Scanner(System.in);						// Scaner pra ler teclado
			
			System.out.print("Digite o valor do salário 1: ");
				String Valor1 = Entrada.next().replace(",",".");		// o . replace muda o que é no caso trocou  a virgula pelo ponto
			
			System.out.print( "\nDigite o valor do salário 2: ");
				String Valor2 = Entrada.next().replace(",",".");
			
			System.out.print("\nDigite o valor do salário 3: ");
				String Valor3 = Entrada.next().replace(",",".");
			
				
				double s1=Double.parseDouble(Valor1);					// parse doble trasfoma string pra double, tem ainda
				double s2=Double.parseDouble(Valor2);					// parse float, parse int....
				double s3=Double.parseDouble(Valor3);
				
				double media= (s1+s2+s3)/3;
					System.out.println("O salário dos 3 meses é:" + media + "R$");

					
		Entrada.close();												// sempre fechar o escaner
	}
}
