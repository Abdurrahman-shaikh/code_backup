class TeatPQDemo{
	public static void main(String[] args){
		PQDemo pq = new PQDemo(10);
		pq.insert(4);
		pq.insert(4);
		pq.insert(43);
		pq.insert(4);
		pq.insert(44);
		pq.insert(46);
		pq.insert(4);
		pq.insert(46);
		pq.insert(4);
		pq.insert(64);
		pq.insert(4);
		pq.insert(400);

		System.out.println(pq.get());
	}
}
