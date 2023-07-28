class Frequency{

	void frequencyPrinter(String s){
	int count = 1;
		for(int i = 0; i < s.length(); i++){
		count =1;
		if(s.charAt(i) == ' ')continue;
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == s.charAt(i) && j > i){
					count++;
				}else if(s.charAt(j) == s.charAt(i) && j < i){
					count = 0;
					break;
				}
			}

			if(count > 0){
			    System.out.println(s.charAt(i) + " " + count);
			}
		}
	}

	public static void main(String[] args){
        
		String sc = "Lucknow Junction";
		Frequency f = new Frequency();
		f.frequencyPrinter(sc);
	}
}
