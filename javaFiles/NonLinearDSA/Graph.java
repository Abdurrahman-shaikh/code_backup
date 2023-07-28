class Graph{

	private int Vcnt, Ecnt;
	private boolean digraph;
	private boolean[][] adj;

	Graph(int v, boolean flag){
		Vcnt = v;
		Ecnt = 0;
		digraph = flag;
		adj = new boolean[v][v];
	}
	int V(){return Vcnt;}
	int E(){return Ecnt;}

	String Traverse() {
       		StringBuilder sb = new StringBuilder();
        	for (boolean[] row : adj) {
            		for (boolean value : row) {
                		sb.append(value ? "1 " : "0 ");
            		}
            		sb.append("\n");
        	}
        	return sb.toString();
    	}


	boolean isDirected(){return digraph;}

	boolean isConnected(Edge e){
		int v = e.v;
		int w = e.w;
		if(adj[v][w]==true){
			return true;
		}else{
			return false;
		}
	}

	void insert(Edge e){
		int v = e.v;
		int w = e.w;
		if(adj[v][w] == false)Ecnt++;
		adj[v][w]=true;
		if(!digraph)adj[w][v] = true;
	}

	void remove(Edge e){
		int v = e.v;
		int w = e.w;
		if(adj[v][w] == true)Ecnt--;
		adj[v][w] = false;
		if(!digraph)adj[w][v] = false;
	}

//	boolean getEdge(Edge e){
//		int v = e.v;
//		int w = e.w;
//		Node temp = adj[v];
//		while(temp != null){
//			if(temp.v == w)return true;
//			temp = temp.next;
//		}
//		return false;
//	}
}
