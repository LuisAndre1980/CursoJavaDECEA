package aula19;

import java.util.Scanner;

public class OperadorTenario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = idade >= 18 ? "adulto" : (idade <=12 ?"crianca" :"adolescente");
		
		
		/*if(idade > 18){
			indicacao = "Adulto";
			
		}else{
			indicacao = "crianca/adolescente";
		}*/
		System.out.println("Resultado: " +indicacao);

	}

}
