import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testePizza {

	private Pizza pizza;
	
	@Before
	public void criarPizza() {
		pizza = new Pizza();
	}
	
	@Test
	public void testValorPizzaQuinzeReais() {
		pizza.adicionarIngrediente("mussarela", 2);
		assertEquals(15.00, pizza.getPreco(), 0);
	}

	@Test
	public void testValorPizzaVinteReais() {
		pizza.adicionarIngrediente("mussarela", 2);
		pizza.adicionarIngrediente("calabresa", 3);
		assertEquals(20.00, pizza.getPreco(), 0);
	}
	
	@Test
	public void testValorPizzaVinteTresReais() {
		pizza.adicionarIngrediente("mussarela", 2);
		pizza.adicionarIngrediente("calabresa", 3);
		pizza.adicionarIngrediente("catupiry", 3);
		assertEquals(23.00, pizza.getPreco(), 0);
	}
}
