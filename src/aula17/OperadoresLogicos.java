package aula17;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Peso: ");
		int peso = entrada.nextInt();

		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Sexo masculino: 1 e sexo feminino:0");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

		double imc = peso / (altura * altura);
		System.out.println("Seu IMC e: " + imc);
		
		if((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)){
			
			System.out.println("Abaixo do Peso");
		}else if((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)){
			
			System.out.println("Abaixo do Peso.");
		}else if((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc < 26.4));
		  
		    System.out.println("Peso Ideal");
		

		if (imc < 17) {
			System.out.println("Muito Abaixo do Peso.");

		} else if (imc < 18.49) {

			System.out.println("Abaixo do Peso. ");
		} else if (imc > 18.5 && imc < 24.99) {

			System.out.println("Peso Normal. ");

		} else if (imc > 25 && imc < 29.99) {

			System.out.println("Acima do Peso. ");
		} else if (imc > 30 && imc > 34.99) {

			System.out.println("ObesidadeI");
		} else if (imc > 35 && imc > 39.99) {
			System.out.println("Obesidade II");

		} else if (imc >= 40) {
			System.out.println("Gordo! ai não tem jeito.");
		}

	}

}
