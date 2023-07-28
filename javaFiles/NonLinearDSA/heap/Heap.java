import java.util.*;

class Heap{
	private int[] storage;
	private int index;
	private int[] arr = new int[storage.length];
	public Heap(int max_size){
		storage = new int[max_size + 1];
		index = 0;
	}

	public boolean insert(int data){
		if(index ==(storage.length-1))return false;
		storage [++index] = data;
		int k = index;

/*		while(k > 1 && storage[k] > storage[k/2]){
			int temp = storage[k];
			storage[k] = storage[k/2];
			storage[k/2] = temp;
			k = k/2;
		} */
		return true;
	}

	public void heapify(int N){
		int k = N;
		while(k > 1 && storage[k] > storage[k/2]){
			int temp = storage[k];
			storage[k] = storage[k/2];
			storage[k/2] = temp;
			k = k/2;
		}
		System.out.println(Arrays.toString(storage));
	}	
	
	public void heapify(){
		heapify(index);
		tdHeapify(1,index);
	}

	public void tdHeapify(int k,int N){
		while(2*k < N){
			int j = 2 * k;
			if(j < N && less(j,j+1))j++;
			if(!less(k,j))break;
			exchange(k,j);
			k = j;

			arr[k] = storage[k];
			arr[k]++;
			storage[k]++;

		}
		System.out.println(Arrays.toString(arr));
	}	
	

	public void print(){
		for(int i = 1; i < storage.length; i++){
			System.out.print(storage[i] + " ");
		}
		System.out.println();
	}

	public boolean remove(int data){
		return true;
	}

	public boolean less(int index1, int index2){
		return (storage[index1] <= storage[index2]) ? true : false;
	}

	private void exchange(int index1, int index2){
		storage[index1] = storage[index1] + storage[index2];
		storage[index2] = storage[index1] + storage[index2];
		storage[index1] = storage[index1] + storage[index2];
	}
}

class Main{
	public static void main(String[] args){
		Heap heap = new Heap(6);
		heap.insert(5);
		heap.insert(7);
		heap.insert(2);
		heap.insert(8);
		heap.insert(9);
		heap.insert(15);
		heap.print();
		heap.heapify();
	}
}
