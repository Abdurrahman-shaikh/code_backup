class IDemo {
	public static void main(String[] args) {
		// Parent c=new Child(); Because child object is stored in parent type variable
		// we cant call child class methods
		// c.printer();
		// c.show();
		// c.display();
		Parent p = new Parent();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}
}
