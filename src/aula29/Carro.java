package aula29;

public class Carro {
	
	String fabricante = "sem fabricante";
	String modelo;
	String cor;
	int anoDeFabricacao = 2011;
	boolean biCombustivel = true;
	
	Proprietario proprietario;
	
	String retornarNome(){
		return "Martorano Pai de Familia";
	}
	
	void ligar(){
		System.out.println("Ligando Carro: "+ modelo);
	}
	
	

}
