class SymbolTable{

    void frequency(String str){
        char[] ans = new char[122];
        for(int i = 0; i < str.length(); i++){
             if(str.charAt(i) == ' ')continue;
             ans[str.charAt(i)]++;
        }

        System.out.println("Char Frequency");
        for(int i = 0; i < ans.length; i++){
            if(ans[i] > 0)System.out.println((char)i + "\t " + (int)ans[i]);
        }
    }

    public static void main(String[] args){
        String str = "Lucknow Junction";
        SymbolTable table = new SymbolTable();
        table.frequency(str);
    }
}
