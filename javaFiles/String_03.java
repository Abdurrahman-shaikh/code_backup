class String_03{
        public static void main(String[] args){
                String s="  Lucknow ";
                s=s.concat("City ");
                System.out.println(s);
                s=s.toUpperCase();
		s=s.concat("INTEGRAL");
                System.out.println(s);
                s=s.toLowerCase();
		System.out.println(s.trim());
		System.out.println(s.length());
		String s1="Lucknow Junction";
		int len=s1.length();
		for(int i=0; i<len; i++){
		System.out.print(s1.charAt(i));
		}
		System.out.println();
                System.out.println(s1.indexOf('n'));
		System.out.println(s1.lastIndexOf('n'));
		String s2="Kanpur Dehaat";
		String s3=s2.substring(7);
		System.out.println(s3);
		s3=s2.substring(7,11);
		System.out.println(s3);
		String s5="Lucknow";
		char[] ca=s5.toCharArray();
		for(int i=0; i<ca.length;i++){
		System.out.print(ca[i]);
		}
		System.out.println();
        }
}
