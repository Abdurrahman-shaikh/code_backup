class PQDemo{
	private int[] arr;
	private int index;
	PQDemo(int max){
		arr = new int[max];
		index = -1;
	}

	public boolean insert(int data){
		if(index == arr.length-1)return false;
		arr[++index] = data;
		return true;
	}

	public int get(){
		if(index == -1)return -1;
		int k = 0;
		for(int i = 0; i <= index; i++ ){
			if(arr[i] > arr[k])k = i;
		}
		int temp = arr[k];
		arr[k] = arr[index];
		arr[index] = temp;
		return arr[index--];
	}
}
