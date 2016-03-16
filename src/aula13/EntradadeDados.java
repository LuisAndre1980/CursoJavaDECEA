package aula13;

import java.util.Scanner;

public class EntradadeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso/(altura*altura);
		System.out.println("Seu IMC e: " +imc);
		
		
		
		

	}

}
