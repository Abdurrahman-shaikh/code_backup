class TreeTest{
	public static void main(String[] args){
		BST bst = new BST();
		bst.insert(90);
        bst.insert(70);
        bst.insert(120);
        bst.insert(50);
        bst.insert(30);
        bst.insert(60);
		bst.insert(100);
        bst.insert(150);
		bst.insert(170);

		bst.levelOrder();
		bst.preOrder();
		bst.postOrder();

	}
}
