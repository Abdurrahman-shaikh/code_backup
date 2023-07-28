import java.util.*;

class BST{
	private class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
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
			ref.right = insertNode(ref.right, data);
		}
		return ref;
	}

	public void insert(int data){
		root = insertNode(root, data);
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
		while(queue.size() != 0){
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

	private int countNode(Node root){
		int count = 0;
		Stack<Node> stack = new Stack<>();
		if(root == null){
			return 0;
		}else{
		stack.push(root);
			while(!stack.empty()){
				count++;
				Node temp = stack.pop();
				if(temp.right != null)stack.push(temp.right);
				if(temp.left != null)stack.push(temp.left);
			}
			System.out.println();
		}
		return count;
	}

	public int count(){
		int ans = countNode(root);
		return ans;
	}

	private int leafNode(Node root){
		int lCount = 0;
		Stack<Node> stack = new Stack<>();
		if(root == null){
			return 0;
		}else{
		stack.push(root);
			while(!stack.empty()){
				Node temp = stack.pop();
				if(temp.right != null)stack.push(temp.right);
				if(temp.left != null)stack.push(temp.left);
				if(temp.right == null && temp.left == null)lCount++;
			}
			System.out.println("");
		}
		return lCount;
	}

	public int leaf(){
		int ans = leafNode(root);
		return ans;
	}

	public void length() {
    	int level = 0;
    	LinkedList<Node> queue = new LinkedList<>();
	    if (root == null) {
			System.out.println("Emptyyy");
    	}
    	queue.addFirst(root);
    	while (queue.size() != 0) {
        	int size = queue.size();
        	for (int i = 0; i < size; i++) {
            	Node temp = queue.removeLast();
            	if (i == 0) {
               		level++;
            	}
            	if (temp.left != null) {
                	queue.addFirst(temp.left);
            	}
            	if (temp.right != null) {
                	queue.addFirst(temp.right);
            	}
        	}
    	}
		System.out.println("Level"+ level);
	}
	
	private void preeOrdersTraverse(Node root){
		if(root == null)return;
		System.out.println(root.data);
		preeOrdersTraverse(root.left);
		preeOrdersTraverse(root.right);
	}

	public void preOrderTraverse(){
 		preeOrdersTraverse(root);
	}
	private void inOrdersTraverse(Node root){
		if(root == null)return;
		inOrdersTraverse(root.left);
		System.out.println(root.data);
		inOrdersTraverse(root.right);
	}

	public void inOrderTraverse(){
 		inOrdersTraverse(root);
	}

	private void postOrdersTraverse(Node root){
		if(root == null)return;
		postOrdersTraverse(root.left);
		postOrdersTraverse(root.right);
		System.out.println(root.data);
	}

	public void postOrderTraverse(){
 		postOrdersTraverse(root);
	}

}

