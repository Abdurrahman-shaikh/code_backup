public class RobinKarp {
    int robinKarp(String str,String pattern){
        int[] hash=new int[str.length()-pattern.length()];
        for (int i = 0; i < hash.length; i++) {
            hash[i]=getHash(str,i,i+pattern.length()-1);
        }
        int phash=getHash(pattern,0,pattern.length()-1);
        for (int i = 0; i < hash.length; i++) {
            if(hash[i]==phash){
		int j=0;
                while(j<pattern.length()){
                    if(pattern.charAt(j)!=str.charAt(i+j))break;
                    j++;
                }
                if(j==pattern.length()) return i;
            }
        }
        return -1;
    }
    int getHash(String s,int si,int li){
        int x=1;
        while (si<=li) {
            x=x*(int)(s.charAt(si));
            si++;
        }
        return x%13;
    }
    public static void main(String[] args) {
        String text="Integral University Lucknow";
        String pattern="niver";
        RobinKarp r= new RobinKarp();
        int result= r.robinKarp(text,pattern);
        System.out.println(result);
    }
}
