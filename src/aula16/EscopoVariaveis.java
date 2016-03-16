package aula16;

import java.util.Scanner;

public class EscopoVariaveis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a Sua Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		String nomePai = "";
		
		if(!podeDirigir){
			
			System.out.println("Nome do pai");
			nomePai = entrada.next();
		}
		System.out.println("Pode Dirigir ");
          
		if(podeDirigir){
			System.out.println("Sim, Claro");
		}else{
			System.out.println("Não, se fizer isso, seu pai" + nomePai + "vai preso");
		}
	}

}
