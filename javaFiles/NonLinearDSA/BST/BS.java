class BS{
	
	private class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data){
			this.data = data;

		}
		
	}

	TreeNode root = null;

	private TreeNode insert(TreeNode ref, int data){
		if(ref == null){
			ref = new TreeNode(ref.data);
			root = ref;
		}

		if(data > ref.data){
			ref.left = insert(ref.left,data);
		}else if{
			ref.right = insert(ref.right,data);
		}
		return ref;
	}

	public void insert(int data){
		insert(root, data);
	}
}

class Main{
	public static void main(String[] args){
		BS bs = new BS();
		bs.insert(73);
		bs.insert(74);
		bs.insert(23);
		bs.insert(78);
		bs.insert(03);
		bs.insert(93);
		bs.insert(43);
		bs.insert(83);
		bs.insert(23);
		bs.insert(43);
	}
}
