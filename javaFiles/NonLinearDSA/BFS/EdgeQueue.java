import java.util.*;

class EdgeQueue{

	private class Node{
		Edge data;
		Node next;

		Node(Edge e){
			data = e;
			next = null;
		}
	}

	private Node front;
	private Node rear;

	EdgeQueue(int max){
		rear = null;
		front = null;
	}

	boolean isEmpty(){
		return (front == null);
	}

public boolean put(Edge data) {
    Node temp = new Node(data);
    if (temp == null) return false;
    if (rear == null && front == null) {
        rear = temp;
        front = temp;
    } else {
        rear.next = temp;
        rear = temp;
    }
    return true;
}

public Edge get() {
    if (front == null) {
        rear = null;
        return null;
    }
    Node temp = front;
    front = front.next;
    return temp.data;
}
}
