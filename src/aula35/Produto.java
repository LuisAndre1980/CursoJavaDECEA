package aula35;

public class Produto {
	

	void definirPreco(double precoCustos) {
		precoCustos = precoCustos * 1.20;
	}

	void definirPreco(Preco preco, double percentualImposto, double margemLucro) {

		preco.valorImpostos = preco.valorCustos * (percentualImposto / 100);

		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;

   }
}
