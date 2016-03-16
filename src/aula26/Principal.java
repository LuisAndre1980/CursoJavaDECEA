package aula26;
/*Intoducao a Orientacao a Objetos -OO */

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Carro carro2 = carro;
		
		carro.anoFabricacao = 2000;
		carro.cor = "Prata";
		carro.marca = "Nissan";
		carro.modelo = "Centra";
		
		carro.anoFabricacao = 2016;
		carro.cor = "Branco";
		carro.marca = "Citroen";
		carro.modelo = "Aicross";
		
		carro.anoFabricacao = 2010;
		
		System.out.println(carro.anoFabricacao);
		System.out.println(carro.cor);
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		
		System.out.println();
		
		System.out.println(carro2.anoFabricacao);
		System.out.println(carro2.cor);
		System.out.println(carro2.marca);
		System.out.println(carro2.modelo);
		
		System.out.println();
		
		carro.taxaGoverno = 5.2;
		double preco = (carro.valorInicial + carro.frete + carro.emplacamento)*carro.taxaGoverno;
		
		System.out.println("Marca: " +carro.marca+"Modelo" +carro.modelo+ "Preço: R$" +preco);
		

	}

}
