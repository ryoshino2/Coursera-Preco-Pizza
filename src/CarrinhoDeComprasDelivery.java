

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasDelivery implements ICarrinhoDeCompras {
	private List<Produtos> produtos = new ArrayList<Produtos>();

	@Override
	public void adicionarItem(Produtos produto) {
		if (produto.getIngredientes().size() > 0) {
    		produtos.add(produto);
    	}
    	else {
    		throw new IllegalArgumentException("pizza sem ingrediente.");
    	}
	}

	@Override
	public List<Produtos> getProdutos() {
		return produtos;
	}
}