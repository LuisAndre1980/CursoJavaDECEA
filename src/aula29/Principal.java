package aula29;

public class Principal {

	public static void main(String[] args) {
		
		Proprietario proprietario = new Proprietario();
		proprietario.nome = "Martorano Pai de Familia";
		proprietario.cpf = "000.000.000-00";
		proprietario.idade = 28;
		proprietario.logradouro = "Rua Gay";
		proprietario.bairro = "Arco-iris";
		proprietario.cidade = "Gay";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Rosa";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.proprietario = proprietario;
		
		System.out.println(meuCarro.fabricante +"Nome: " + proprietario.nome);
		
		System.out.println(meuCarro.fabricante);
		System.out.println(meuCarro.proprietario.nome);
		
		
	   
		

	}

}
