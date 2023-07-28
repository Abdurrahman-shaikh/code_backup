class GraphDFS{

	private AdjListGraph g;
	private int cnt;
	private int[] ord;

	private void search(int v){
		ord[v] = cnt++;
		AdjList a = g.getAdjList(v);
		for(int i = a.beg(); !a.end(); i = a.nxt()){
//                        System.out.println(i);
			if(ord[i] == -1)search(i);
		}
		System.out.println(v);

	}

	GraphDFS(AdjListGraph g, int v){
		this.g = g;
		cnt = 0;
		ord = new int[g.V()];
		for(int i = 0; i < g.V(); i++){
			ord[i] = -1;
		}
		search(v);
	}

	int count(){return cnt;}

	int order(int v){return ord[v];}
}
