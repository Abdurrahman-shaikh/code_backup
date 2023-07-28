class DFSTest{
	public static void main(String[] args){
		AdjListGraph g = new AdjListGraph(5,false);
		Edge e = new Edge(0,1);
                Edge e1 = new Edge(0,2);
                Edge e2 = new Edge(0,4);
                Edge e3 = new Edge(1,3);
                Edge e4 = new Edge(1,0);
                Edge e8 = new Edge(2,0);
                Edge e9 = new Edge(2,3);
                Edge e10 = new Edge(2,4);
                Edge e5 = new Edge(3,1);
                Edge e6 = new Edge(3,2);
                Edge e7 = new Edge(3,4);
                Edge e11 = new Edge(4,0);
                Edge e12 = new Edge(4,3);
		Edge e13 = new Edge(4,2);

		g.insertEdge(e);
                g.insertEdge(e1);
                g.insertEdge(e2);
                g.insertEdge(e3);
                g.insertEdge(e4);
                g.insertEdge(e5);
                g.insertEdge(e6);
                g.insertEdge(e7);
                g.insertEdge(e8);
                g.insertEdge(e9);
                g.insertEdge(e10);
                g.insertEdge(e11);
                g.insertEdge(e12);
                g.insertEdge(e13);

		GraphDFS gd = new GraphDFS(g,0);
		System.out.println("Count :" + gd.count());
		System.out.println("Order :" + gd.order(0));
	}
}
