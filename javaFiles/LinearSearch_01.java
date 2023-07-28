class LinearSearch_01{

	public static void main(String[] args){
		String str = "My name is Azmi";
		char target = 'b';
		LinearSearch_01 ln = new LinearSearch_01();
		boolean ans = ln.search(str,target);
		System.out.println(ans);
	}

	boolean search(String str, char target){
		if(str.length() == 0)return false;

		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)==target){
				return true;
			}
		}
	return false;
	}
}
