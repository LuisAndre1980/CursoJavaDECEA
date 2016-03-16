package aula38;

public class TesteArray {
	
	public static void main(String[] args) {
		
		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 7;
		
		//for (int i = 0; i<4; i++ ){
			//System.out.println("Posição[" + i + "]="+ notas[i]);
		//}
		System.out.println("Nota do Primeiro aluno: "+ notas.length);
		for(int i = 0;  i <= notas.length; i++ ){
			System.out.println("Posicao["+ i + "]=" + notas[i]);
		}
		
	}

}
