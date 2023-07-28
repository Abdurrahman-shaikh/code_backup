import java.util.*;

class GraphBFS{

	private AdjListGraph g;
	private int cnt;
	private int[] ord,st;
	private void search(Edge e) {
		EdgeQueue q = new EdgeQueue(g.V());
		q.put(e);
		ord[e.v] = cnt++;
		while (!q.isEmpty()) {
			e = q.get();
			int v = e.v;
        		AdjList A = g.getAdjList(v);
        		for (int t = A.beg(); !A.end(); t = A.nxt()) {
            			if (ord[t] == -1) {
                			q.put(new Edge(v, t));
                			ord[t] = cnt++;
                			st[t] = v;
            			}
        		}

		}
	}

	GraphBFS(AdjListGraph g, int v){
		this.g = g;
		cnt = 0;
		ord = new int[g.V()];
                st = new int[g.V()];
		for(int t = 0; t<g.V(); t++){
			ord[t] = -1;
			st[t] = -1;
		}
		for(int t = 0; t<g.V(); t++){
                        if(ord[t] == -1)search(new Edge(t,t));
                }
	}
	int[] getBFSTraversal() {
        return st;
    }
}
