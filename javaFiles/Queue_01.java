import java.util.*;
class Queue{
	int data;
	Queue next;
	static Queue front = null;
	static Queue rear = null;
	Queue(int x){
		data = x;
	}
	Queue(){}
	public boolean enqueue(int data){
		Queue temp = new Queue(data);
		if(temp == null) return false;
                if(rear == null && front == null){
                        rear = temp;
			front = temp;
                }else{
                        rear.next = temp;
                        rear = rear.next;
                }
                return true;
        }
	public int dequeue(){
		Queue temp = front;
        	if(front == null){
                	rear = null;
			return -1;
                }
                front = front.next;
                return temp.data;
        }
        public static void main(String[] args){
                int n;
                System.out.println("Enter the data to be pushed");
                Scanner sc = new Scanner(System.in);
                Queue m1 = new Queue();
                m1.enqueue(10);
                m1.enqueue(20);
                m1.enqueue(30);
                System.out.println(m1.dequeue());
                System.out.println(m1.dequeue());
                System.out.println(m1.dequeue());
                System.out.println(m1.dequeue());
        }
}
