import java.util.*;

class DequeDemo{
	public static void main(String[] args){
		LinkedList<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++){
			deque.addFirst(i);
		}
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		deque.addFirst(20);
		deque.addLast(30);
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
	}
}
