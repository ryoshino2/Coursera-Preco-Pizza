

import java.util.Map;

public interface Produtos {
	public void adicionarIngrediente(String ingrediente, int qtdeIngredientes);
	public Double getPreco();
	public Map<String, Integer> getIngredientes();
	public int getTotalIngredientes();
}
