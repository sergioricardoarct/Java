package Condicionais;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota: ");
		
		double media = entrada.nextDouble();
		
		if (media <=10 && media>=7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		if (media <7 && media>=5) {
			System.out.println("Recuperação");
		}
		
		if (media<5 && media >=0) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
		}
	}
	

