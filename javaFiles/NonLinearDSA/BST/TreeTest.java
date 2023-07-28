class TreeTest{
	public static void main(String[] args){
		BST bst = new BST();
		bst.insert(50);
        bst.insert(30);
        bst.insert(80);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
		bst.insert(100);
        bst.insert(55);
		bst.insert(70);
		bst.levelOrder();
		bst.preOrder();
		int ans = bst.count();
		System.out.println(ans);
		int leaf = bst.leaf();
		System.out.println(leaf);
		bst.length();
		bst.preOrderTraverse();
		bst.inOrderTraverse();
		bst.postOrderTraverse();
	}
}
