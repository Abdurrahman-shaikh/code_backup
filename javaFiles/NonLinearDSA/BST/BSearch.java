class BSearch{
    private class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
    }
    
    Node root = null;
    Node insert(Node ref, int data){
        if(ref == null){
            ref = new Node(data);
            root = ref;
            System.out.println(ref.data);
        }else if(data < ref.data){
            ref.left = insert(ref.left, data);
        }else{
            ref.right = insert(ref.right, data);
        }
        return ref;
    }

    void insert(int data){
        insert(root,data);
    }

    boolean search(Node ref, int data){

        if(ref == null)return false;
        
        if(data == ref.data)return true;

        if(data < ref.data){
            return search(ref.left, data);
        }else if(data > ref.data){
            return search(ref.right, data);
        }
        return true;
    }

    void search(int data){
        boolean ans = search(root, data);
        System.out.println(ans);
    }

    public static void main(String[] args){

        BSearch bs = new BSearch();
        bs.insert(12);
        bs.insert(11);
        bs.insert(17);
        bs.insert(15);
        bs.insert(103);
        bs.insert(19);
        bs.insert(10);

        bs.search(101);

    }
}
