class RadixCounting{

	public static void main(String[] args){
		int[] arr = {9342,654,3,6,87};
		Radix r =  new Radix();
		r.redixSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}


	int maxDigit(int arr[]){
		int max = arr[0];
		int count  = 0;
		if(arr.length == 0)return 0;

		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		while(max > 0){
			max /= 10;
			count++;
		}
		return count;
	}

	void redixSort(int[] a){
		int mdigit = maxDigit(a);
		int place = 1;
		for(int i = 1; i <= mdigit; i++){
			countingSort(a,place);
			place = place * 10;
		}

	}


        public void countingSort(int[] arr,int pv){
                int min = arr[0], max = arr[0];

		if((arr[i]/pv%10) > (arr[i + 1]/pv%10)){

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
        }
}
