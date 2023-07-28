import java.util.*;

class GraphBFS {
    private AdjListGraph g;
    private int cnt;
    private int[] ord, st;

    private void search(int v) {
        EdgeQueue q = new EdgeQueue(g.V());
        q.put(new Edge(v, v));
        ord[v] = cnt++;
        while (!q.isEmpty()) {
            Edge e = q.get();
            int vertex = e.v;
            AdjList A = g.getAdjList(vertex);
            for (int t = A.beg(); !A.end(); t = A.nxt()) {
                if (ord[t] == -1) {
                    q.put(new Edge(vertex, t));
                    ord[t] = cnt++;
                    st[t] = vertex;
                }
            }
        }
    }

    GraphBFS(AdjListGraph g, int v) {
        this.g = g;
        cnt = 0;
        ord = new int[g.V()];
        st = new int[g.V()];
        for (int t = 0; t < g.V(); t++) {
            ord[t] = -1;
            st[t] = -1;
        }
        for (int t = 0; t < g.V(); t++) {
            if (ord[t] == -1) {
                search(t);
            }
        }
    }

    int[] getBFSTraversal() {
        return st;
    }
}
