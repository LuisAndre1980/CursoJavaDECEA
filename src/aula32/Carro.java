package aula32;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel = true;
	
	
	Proprietario proprietario;
	
	
	String retornarNome(){
		return "Martorano Pai de Familia";
	}
	
	void ligar(){
		System.out.println("Ligando Carro: "+ modelo);
	}

	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", anoDeFabricacao="
				+ anoDeFabricacao + ", biCombustivel=" + biCombustivel + ", proprietario=" + proprietario + "]";
	}
	
	
	

}
