class Frequency{

    public static void main(String[] args){
        Frequency fc = new Frequency();
        String str = "Lucknow Junction";
        fc.frequencyCounter(str);
    }

    public void frequencyCounter(String str){
        for(int i = 0; i < str.length(); i++){
            int count = 1;
            if(str.charAt(i) == ' ')continue;

            for(int j = 0 ; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j) && j > i)count++;
                    if(str.charAt(i) == str.charAt(j) && j < i){
                    count = 0;
                    break;
                } 
            }

            if(count > 0){
                System.out.println(str.charAt(i) + " " + count);
            } 
        }
    }
}
