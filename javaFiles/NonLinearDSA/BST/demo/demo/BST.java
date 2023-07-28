import java.util.*;

class BST{
	private class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	Node root = null;

	public Node insertNode(Node ref, int data){
		if(ref == null){
			ref = new Node(data);
			root = ref;
		}else if(data < ref.data){
			ref.left = insertNode(ref.left, data);
		}else{
			ref.right = insertNode(ref.right,data);
		}
		return ref;
	}

	public void insert(int data){
		root = insertNode(root,data);
	}

	public void levelOrder(){
		Node temp = null;
		LinkedList<Node> queue = new LinkedList<>();
		if(root == null){
			System.out.println("Tree is Empty");
			return;
		}
		queue.addFirst(root);
		System.out.print("LevelOrder: ");
		while(queue.size()!=0){
			temp = queue.removeLast();
			System.out.print(temp.data + " ");
			if(temp.left != null)queue.addFirst(temp.left);
			if(temp.right != null)queue.addFirst(temp.right);
		}
		System.out.println();
	}

	public void pre(Node root){
		Stack<Node> stack = new Stack<>();
		if(root == null){
			System.out.println("Tree is empty");
		}else{
		stack.push(root);
		System.out.print("PreOrder: ");
			while(!stack.empty()){
				Node temp = stack.pop();
				System.out.print(temp.data + " ");
				if(temp.right != null)stack.push(temp.right);
				if(temp.left != null)stack.push(temp.left);
			}
			System.out.println();
		}
	}

	public void preOrder(){
		pre(root);
	}

	public void post(Node root){
		Stack<Node> stack = new Stack<>();
		if(root == null){
			System.out.println("Tree is empty");
		}else{
		stack.push(root);
		System.out.print("PostOrder: ");
			while(!stack.empty()){
				Node temp = stack.peek();
				while(temp.left != null){
					stack.push(temp.left);
					temp = temp.left;
				}
				temp = stack.pop();
				System.out.print(temp.data + " ");
				if(temp.right != null)stack.push(temp.right);
				if(stack.empty())stack.push(temp);
				//if(temp.left != null)stack.push(temp.left);
			}
			System.out.println();
		}
	}

	public void postOrder(){
		post(root);
	}
}
