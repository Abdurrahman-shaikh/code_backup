import java.util.*;

class BST2{
	Node root = null;
	Node temp = null;

	public void insert(Scanner scanner){
		System.out.println("Enter the value of root node ");
		int value = scanner.nextInt();
		root = new Node(value);
		insert(root, scanner);
	}

	void insert(Node temp, Scanner scanner){
		System.out.println("Do you want to insert at left (true/false) ");
		boolean left = scanner.nextBoolean();
		if(left){
			System.out.println("Enter the value at the left of " + temp.data);
			int value = scanner.nextInt();
			temp.left = new Node(value);
			insert(root, scanner);
		}

		System.out.println("Do you want to insert at right (true/false) ");
		boolean right = scanner.nextBoolean();
		if(right){
			System.out.println("Enter the value at the left of " + temp.data);
			int value = scanner.nextInt();
			temp.right = new Node(value);
			insert(root, scanner);
		}
	}

	void traverse(){
		traverse(root);
	}

	void traverse(Node node){
		if (node == null)return;
		System.out.println(node.data);
		traverse(node.left);
		traverse(node.right);
	}
}
