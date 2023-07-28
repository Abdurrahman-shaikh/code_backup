import java.util.*;
class MyStack{
	int data;
	MyStack next;
	static MyStack top = null;
	MyStack(int d){
		data = d;
	}
	MyStack(){}

	public boolean push(int data){
		MyStack temp = new MyStack(data);
		if(temp == null) return false;
		if(top == null){
			top = temp;
		}else{
			temp.next = top;
			top = temp;
		}
		return true;
	}

	public int pop(){
		if(top == null){
			System.out.println("Empty");
			return -1;
		}
		int x = top.data;
		top = top.next;
		return x;
	}
	public static void main(String[] args){
		int n;
		System.out.println("Enter the data to be pushed");
		Scanner sc = new Scanner(System.in);
		MyStack m1 = new MyStack();
		m1.push(10);
		m1.push(20);
		m1.push(30);
		System.out.println(m1.pop());
		System.out.println(m1.pop());
		System.out.println(m1.pop());
		System.out.println(m1.pop());
	}
}

