
/*Algoritmo de inserção em árvore*/
public class Tree {

	Node root = null;
	int size = 0;

	void insert(int info, Node place) {
		if (place == null) {
			root = new Node(info);
		} else if (info < place.info) {
			if (place.left == null) {
				place.left = new Node(info);
			} else {
				insert(info, place.left);
			}
		} else if (info > place.info) {
			if (place.right == null) {
				place.right = new Node(info);
			} else {
				insert(info, place.right);
			}
		}
	}
	
	void preOrder(Node place) {
		System.out.println(" " + place.info);
		if(place.left==null) {
			preOrder(place.left);
		}
		if(place.right !=null) {
			preOrder(place.right);
		}
	}
	
	void inOrder(Node place) {
		
		if(place.left !=null) {
			inOrder(place.left);
		}		
		System.out.println(" " + place.info);
		if(place.right != null) {
			inOrder(place.right);
		}
		
	}
	
	void posOrder(Node place) {
		if(place.left != null) {
			posOrder(place.left);
		}
		if(place.right != null) {
			posOrder(place.right);
		}
		System.out.println(" " + place.info);
	}

}
