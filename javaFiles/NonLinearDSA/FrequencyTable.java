class FrequencyTable{

    void frequency(String str){
        int[] map = new int[122];
        for(int i = 0; i < str.length(); i++){
             if(str.charAt(i) == ' ')continue;
             map[str.charAt(i)]++;
        }

        for(int i = 0; i < map.length; i++){
            if(map[i] == 0)continue;
            System.out.println((char)i + " " + map[i]);
        }
    }

    public static void main(String[] args){
        String str = "Lucknow Junction";
        FrequencyTable table = new FrequencyTable();
        table.frequency(str);
    }
}

