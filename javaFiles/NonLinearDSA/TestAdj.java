class TestAdj{
	public static void main(String[] args){
		AdjListGraph ad = new AdjListGraph(5,false);
                System.out.println(ad.V());
                System.out.println(ad.E());

		Edge ag = new Edge(0,1);
                Edge ag1 = new Edge(0,2);
                Edge ag2 = new Edge(3,2);
                Edge ag3 = new Edge(2,3);
		ad.insertEdge(ag);
                ad.insertEdge(ag1);
                ad.insertEdge(ag2);
                ad.insertEdge(ag3);

		ad.traverse();

	//	int ans = ad.beg();
//                System.out.println(ans);
                System.out.println(ad.V());
                System.out.println(ad.E());
	}
}
