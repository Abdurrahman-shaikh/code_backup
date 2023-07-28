class Radix{

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
			bubbleSort(a,place);
			place = place * 10;
		}

	}

	void bubbleSort(int[] a, int pv){
		for(int pass = 1; pass < a.length; pass++){
			int temp;
			for(int i = 0; i < a.length - pass; i++){
				if((a[i]/pv%10) > (a[i + 1]/pv%10)){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
}
