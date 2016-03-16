package aula38;

public class TesteArrayComCarro {

	public static void main(String[] args) {
		
		Carro[] carro = new Carro[4];
		
		carro[0] = new Carro();
		carro[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano Fabricacao: " + carro[0].anoDeFabricacao);

	}

}
