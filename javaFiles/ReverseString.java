class ReverseString{

    public static void main(String[] args){
        ReverseString st = new ReverseString();
        String string = "My name is";
        String ans = st.reverse(string);
        System.out.println(ans);
    }

    public String reverse(String str){
        char[] ch = str.toCharArray();
        int i = 0, k = 0, j = 0;
    while(j < ch.length){
        while(j < ch.length && ch[j] != ' ')j++;
        k = j - 1;
        char c;

        while(i < k){
                c = ch[i];
                ch[i++] = ch[k];
                ch[k--] = c;    
            }
            i = j + 1;
            j++;
       }
       String s = new String(ch);
       return s;
    }
}
