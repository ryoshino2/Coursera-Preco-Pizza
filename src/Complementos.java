

import java.util.HashMap;
import java.util.Map;

public class Complementos implements Produtos {
	private Map<String, Integer> ingredientes = new HashMap<String, Integer>();
	private int totalIngredientes;
	@Override
	public void adicionarIngrediente(String ingrediente, int qtdeIngredientes) {
		if(qtdeIngredientes<=0) {
			throw new IllegalArgumentException("Quantidade de ingrediente invalida");
		}else {	
		ingredientes.put(ingrediente.toUpperCase(), qtdeIngredientes);
		}
	}

	@Override
	public Double getPreco() {
		int quantidadeIngredientes = getTotalIngredientes();
		if(quantidadeIngredientes<3) {
			return 15.00;
		}
		if (quantidadeIngredientes<6) {
			return 20.00;
		}
			return 23.00;
	}

	@Override
	public Map<String, Integer> getIngredientes() {
		return ingredientes;
	}
	
	@Override
	public int getTotalIngredientes() {
		for (Map.Entry<String, Integer> entryValue : getIngredientes().entrySet()) {
	        Integer valor = entryValue.getValue();
	        totalIngredientes += (valor);
	    }
		return totalIngredientes;
	}
}
