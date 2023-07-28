class CountingSort{
	public void countingSort(int[] arr){
		int min = arr[0], max = arr[0];

		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min)min = arr[i];
			if(arr[i] > max)max = arr[i];
		}
		
		int range = max - min + 1;
		int[] count = new int[range];

		for(int i = 0; i < arr.length; i++){
			count[arr[i]]++;
		}

		for(int i = 1; i < count.length; i++){
			count[i] = count[i] + count[i-1];
		}

		int[] farr = new int[arr.length];

		for(int i = arr.length - 1; i >= 0; i--){
			farr[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}

		for(int i = 0; i < arr.length; i++){
			arr[i] = farr[i];
		}
	}

	public static void main(String[] args){
		int[] arr = {0,9,9,8,6,5,3,2,6,8,9,3,1,7};
		CountingSort sort = new CountingSort();
		sort.countingSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
