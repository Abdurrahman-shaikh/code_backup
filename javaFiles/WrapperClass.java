class WrapperClass{
	public static void main(String[] args){
		int x=10;
		Integer it=new Integer(x);
		Integer it2=new Integer("13");
		Character chr=new Character('A');
		int a=it.intValue();
		char b=chr.charValue();
		System.out.println(b);
		System.out.println(a);
		String s="6473";
		Integer it4=new Integer(s);
		int z=it4.intValue();
		int y=Integer.parseInt(s);
		System.out.println(z);
		System.out.println(y);
	}
}
