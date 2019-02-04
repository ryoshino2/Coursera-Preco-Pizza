

import java.util.HashMap;
import java.util.Map;

public class Pizza implements Produtos {
	private Map<String, Integer> ingredientes = new HashMap<String, Integer>();
	private int totalIngredientes;

	public void adicionarIngrediente(String ingrediente, int qtdeIngredientes) {
		if (qtdeIngredientes <= 0) {
			throw new IllegalArgumentException("Quantidade de ingrediente invalida");
		} else {
			ingredientes.put(ingrediente.toUpperCase(), qtdeIngredientes);
		}
	}

	public Double getPreco() {
		int quantidadeIngredientes = getTotalIngredientes();
		if (quantidadeIngredientes < 3) {
			return 15.00;
		}
		if (quantidadeIngredientes < 6) {
			return 20.00;
		}
		return 23.00;
	}

	public Map<String, Integer> getIngredientes() {
		return ingredientes;
	}

	public int getTotalIngredientes() {
		totalIngredientes = ingredientes.entrySet().stream().map(x -> x.getValue()).reduce(0, (x, y) -> x + y);
		return totalIngredientes;
	}

}