import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Utilizando numeros randomicos
		Random rand = new Random();
		Tree tree = new Tree();
		
		for(int i=0; i<10;i++) {
			//Inserção de numero de 0 a 100 na raiz da árvore
			tree.insert(rand.nextInt(100), tree.root);
		}
		
		System.out.println("\n Pre-Order: ");
		tree.preOrder(tree.root);
		
		System.out.println("\n In-Order: ");
		tree.inOrder(tree.root);
		
		System.out.println("\n Pos-Order");
		tree.posOrder(tree.root);
	}

}
