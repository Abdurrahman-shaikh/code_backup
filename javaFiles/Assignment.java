public class Assignment {
	void Assign(int[] arr){
		int n=arr.length;
	int max_idx = n - 1, min_idx = 0;

	int max_elem = arr[n - 1]+1;

	for(int i = 0;i<n;i++)
	{

		if (i % 2 == 0) {
			arr[i] += (arr[max_idx] % max_elem) * max_elem;
			max_idx--;
		} else {
			arr[i] += (arr[min_idx] % max_elem) * max_elem;
			min_idx++;
		}
	}for(int j = 0;j<n;j++)arr[j]=arr[j]/max_elem;
}
void print(int arr[]){
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

public static void main(String args[]) {	
int arr[]={3,2,5,3,6,4};
Assignment as=new Assignment();
as.Assign(arr);
as.print(arr);
}
}