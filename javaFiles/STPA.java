class STPA{

    int[] key;
    float[] value;
    int location;

    STPA(int size){
        key = new int[size];
        value = new float[size];
        location = 0;
    }

    public static void main(String[] args){
        STPA s = new STPA(5);
        s.insert(2,2.0f);
        s.insert(3,3.0f);
        s.insert(4,4.0f);
        s.insert(5,5.0f);
        s.insert(6,6.0f);

        System.out.println(s.get(3));
    }

    public boolean insert(int k, float v){
        if(location == key.length) return false;
        for(int i = 0; i < key.length; i++){
            if(key[i] == k){
                key[i] = k;
                value[i] = v;
                return true;
            }

        }
        key[location] = k;
        value[location++] = v;
        return true;
    }

    public float get(int k){

        int i = 0;
        while(i < key[i] && key[i] != 0){
            if(key[i] == k) return value[i];
            i++;
        }
        return 0.0f;
    }
}
