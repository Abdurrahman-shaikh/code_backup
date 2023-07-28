class TreeTest{
	public static void main(String[] args){
		BST bst = new BST();
		bst.insert(10);
                bst.insert(5);
                bst.insert(20);
                bst.insert(15);
                bst.insert(25);
                bst.insert(35);

		System.out.println("Inorder Traversal:");
        	bst.inorderTraversal(bst.root);
        	System.out.println();

	        System.out.println("Preorder Traversal:");
        	bst.preorderTraversal(bst.root);
	        System.out.println();

	        System.out.println("Postorder Traversal:");
        	bst.postorderTraversal(bst.root);
	        System.out.println();
	}
}
