package aula24;

import java.util.Scanner;

public class ExemploContinue {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int divisor = entrada.nextInt();
		
		for(int i = 0; i<=200; i++){
			if( i% divisor == 0){
				continue;
			}
			System.out.println(i);
			System.out.println("Fim do Programa");
		}

	}

}
