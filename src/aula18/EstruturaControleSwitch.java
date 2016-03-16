package aula18;

import java.util.Scanner;

public class EstruturaControleSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Final da Placa: ");
		int finalPlaca = entrada.nextInt();
		
		switch (finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
			
			break;
		case 2:
			System.out.println("Vencimento dia 12 de janeiro");	
        break;
		
		default:
		System.out.println("Vencimento sem data, desculpe");	
			
		}

	}

}
