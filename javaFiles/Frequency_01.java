class Frequency_01{
	void frequencyByHashing(String s){
		int[] hash = new int[128];
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)]++;
		}
		for(int i=0;i<hash.length; i++){
			if((char)i!=' ' && hash[i]>0){
			System.out.println((char)i+" "+hash[i]);
			}
		}
	}
	public static void main(String[] Args){
		Frequency_01 f=new Frequency_01();
		String str="My Name is Azmi";
		f.frequencyByHashing(str);
	}
}
