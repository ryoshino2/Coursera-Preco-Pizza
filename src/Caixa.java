

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private ICarrinhoDeCompras carrinhoDeCompras;

	public Caixa(ICarrinhoDeCompras carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}

	public double getPrecoTotal() {
		double total = 0;
		double taxaEntrega = 1.00;
		for (Produtos pizza : carrinhoDeCompras.getProdutos()) {
			total += pizza.getPreco();
		}
		if (carrinhoDeCompras instanceof CarrinhoDeComprasRetirada)
			return total;
		else
			return total + taxaEntrega;
	}

	public Map<String, Integer> listarTodosProdutos() {
		Map<String, Integer> cesta = new HashMap<String, Integer>();
		for (Produtos produto : carrinhoDeCompras.getProdutos()) {
			for (String ingrediente : produto.getIngredientes().keySet()) {
				Integer total = produto.getIngredientes().get(ingrediente);
				if (cesta.containsKey(ingrediente)) {
					total += cesta.get(ingrediente);
				}
				cesta.put(ingrediente, total);
			}
		}
		return cesta;
	}

	public int listarQuantidadeProdutos() {
		int totalIngredientes = carrinhoDeCompras.getProdutos().stream().map(x -> x.getTotalIngredientes()).reduce(0,
				(x, y) -> x + y);
		return totalIngredientes;
	}
}
