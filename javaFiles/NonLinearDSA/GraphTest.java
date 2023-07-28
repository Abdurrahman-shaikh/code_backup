class GraphTest{
	public static void main(String[] args){
		Graph g = new Graph(5, false);
		System.out.println(g.V());
		System.out.println(g.E());

		Edge eg = new Edge(0,1);
		Edge eg1 = new Edge(0,2);
                Edge eg2 = new Edge(0,3);
                Edge eg3 = new Edge(0,4);
                Edge eg4 = new Edge(1,0);
                Edge eg5 = new Edge(1,2);
                Edge eg6 = new Edge(2,0);
                Edge eg7 = new Edge(2,1);
                Edge eg8 = new Edge(2,4);
                Edge eg9 = new Edge(3,1);
                Edge eg10 = new Edge(3,0);
                Edge eg11 = new Edge(3,4);
                Edge eg12 = new Edge(4,1);
                Edge eg13 = new Edge(4,2);
                Edge eg14 = new Edge(4,3);

		g.insert(eg);
                g.insert(eg1);
                g.insert(eg2);
                g.insert(eg3);
                g.insert(eg4);
                g.insert(eg5);
                g.insert(eg6);
                g.insert(eg7);
                g.insert(eg8);
                g.insert(eg9);
                g.insert(eg10);
                g.insert(eg11);
                g.insert(eg12);
                g.insert(eg13);
                g.insert(eg14);

		System.out.println(g.V());
                System.out.println(g.E());

//		Edge eg1 = new Edge(0,3);
//		g.remove(eg);
		System.out.println(g.isConnected(eg11));
		System.out.println(g.V());
                System.out.println(g.E());
		System.out.println(g.Traverse());
	}
}
