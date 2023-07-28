class AdjListGraph {

	private int Ecnt, Vcnt;
	private boolean digraph;

	private class Node {
        	int v;
        	Node next;

	Node(int x, Node t) {
		v = x;
		next = t;
        	}
	}

	private Node[] adj;

	AdjListGraph(int v, boolean flag) {
        	Vcnt = v;
        	Ecnt = 0;
        	digraph = flag;
		adj = new Node[v];
	}

	int V() {return Vcnt;}

	int E() {return Ecnt;}

	boolean isDirected(){return digraph;}

	void insertEdge(Edge e){
		int v = e.v;
		int w = e.w;
		if(!getEdge (e)){
			adj[v] = new Node(w, adj[v]);
			if(!digraph)adj[w] = new Node(v, adj[w]);
			Ecnt++;
		}
	}

	boolean getEdge(Edge e){
                int v = e.v;
                int w = e.w;
                Node temp = adj[v];
                while(temp != null){
                        if(temp.v == w)return true;
                        temp = temp.next;
                }
                return false;
        }

	void traverse() {
        	for (int v = 0; v < Vcnt; v++) {
            		System.out.print("Vertex " + v + ": ");
            		Node temp = adj[v];
            		while (temp != null) {
                		System.out.print(temp.v + " ");
                		temp = temp.next;
            		}
            		System.out.println();
        	}
    	}

	AdjList getAdjList(int v){
		return new AdjLinkedList(v);
	}

	private class AdjLinkedList implements AdjList{
		private int v;
		private Node t;
		AdjLinkedList(int v){
			this.v = v;
			t = null;
		}

		public int beg(){
			t = adj[v];
			return t == null?-1:t.v;
		}

		public int nxt(){
			if(t != null)t=t.next;
			return t == null?-1:t.v;
		}

		public boolean end(){
			return t == null;
		}
	}
}
