//Stance of String class is immutable
class String_02{
	public static void main(String[] args){
		String s="Lucknow";
		String s1="Junction";
                System.out.println(s);
                System.out.println(s1);
		System.out.println(s==s1);
		s1=s+" "+s1;
		System.out.println(s==s1);
                System.out.println(s1);
	}
}
