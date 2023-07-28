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

	public void insertNode(Node ref, int data){
		if(ref == null){
			ref = new Node(data);
		}else if(data < ref.data){
			insertNode(ref.left, data);
		}else{
			insertNode(ref.right,data);
		}
	}

	public void insert(int data){
		insertNode(root,data);
	}

	public void inorderTraversal(Node node) {
		if (node != null) {
            		inorderTraversal(node.left);
            		System.out.print(node.data + " ");
            		inorderTraversal(node.right);
        	}
    	}

    	public void preorderTraversal(Node node) {
        	if (node != null) {
            		System.out.print(node.data + " ");
	            preorderTraversal(node.left);
        	    preorderTraversal(node.right);
	        }
	}

    	public void postorderTraversal(Node node) {
        	if (node != null) {
            		postorderTraversal(node.left);
            		postorderTraversal(node.right);
	            System.out.print(node.data + " ");
        	}
    	}
}
