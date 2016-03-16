package aula30;

public class Principal {

	public static void main(String[] args) {
		
		Carro seuCarro =  new Carro();
		
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "preto";
		
		seuCarro.proprietario.nome = "Cleiton Ferreira";
		
		System.out.println(seuCarro.proprietario.nome);
		
		System.out.println(seuCarro.anoDeFabricacao);
		System.out.println(seuCarro.cor);
	   
		

	}

}
