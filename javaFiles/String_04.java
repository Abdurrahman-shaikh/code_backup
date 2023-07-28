class String_04{
	String reverseString(String s){
		char[] ca=s.toCharArray();
		int i=0,j=ca.length-1;
		char temp;
		while(i<j){
			temp=ca[i];
			ca[i]=ca[j];
			ca[j]=temp;
			i++;
			j--;
		}
		return new String(ca);
	}
	public static void main(String[] args){
	String str="Lucknow";
	System.out.println(str);
	String_04 sc=new String_04();
	String result=sc.reverseString(str);
	System.out.println(result);
	}
}
