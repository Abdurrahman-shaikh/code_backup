class String_01{
	public static void main(String[] args){
		String s1="Lucknow";
		String s2="Lucknow";
		String s3=new String("Lucknow");
		String s4=new String("Lucknow");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
	}
}
