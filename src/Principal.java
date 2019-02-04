import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Para entrega(e) ou retirada(r): ");
    	char opcao = scanner.nextLine().charAt(0);
    	ICarrinhoDeCompras carrinhoDeCompras;
    	
    	if(opcao == 'e') {
    		carrinhoDeCompras = new CarrinhoDeComprasDelivery();
    	}else {
    		carrinhoDeCompras = new CarrinhoDeComprasRetirada();
    	}
    	
        Produtos calabresa = new Pizza();
        calabresa.adicionarIngrediente("Calabresa", 1);
        calabresa.adicionarIngrediente("Cebola", 1);
        
        Produtos mussarela = new Pizza();
        mussarela.adicionarIngrediente("Mussarela", 2);
        mussarela.adicionarIngrediente("Ovo", 1);
        
        Produtos especial = new Pizza();
        especial.adicionarIngrediente("Calabresa", 1);
        especial.adicionarIngrediente("Mussarela", 3);
        especial.adicionarIngrediente("Catupiry", 1);
        especial.adicionarIngrediente("Azeitona", 2);

        Caixa caixa = new Caixa(carrinhoDeCompras);
        
        carrinhoDeCompras.adicionarItem(calabresa);
        carrinhoDeCompras.adicionarItem(mussarela);
        carrinhoDeCompras.adicionarItem(especial);

        System.out.println("Total do Preco do Carrinho: " + caixa.getPrecoTotal());
        System.out.println("Ingredientes: ");
        
        System.out.println(caixa.listarTodosProdutos());
    	System.out.println("Total de ingrediente: " +caixa.listarQuantidadeProdutos());
    }
}