import java.util.*;
public class LinkedListt<T>{
	T data;
	LinkedListt<T> next;
	LinkedListt (T x){
		data = x;
	}
	public static LinkedListt<Integer> createList(Scanner sc){
		int num_of_node;
		System.out.println("Enter the number of node to be created");
		num_of_node=sc.nextInt();
		LinkedListt<Integer> head=null;
		LinkedListt<Integer> p=null;
		for(int i=1; i<=num_of_node;i++){
			System.out.println("EnterData");
			LinkedListt<Integer> temp=new LinkedListt<>(sc.nextInt());
			if(i==1)head=temp;
			else{
				p=head;
				while(p.next!=null)p=p.next;
				p.next=temp;
			}
		}
		return head;
	}
	static void traverseList(LinkedListt<Integer> head){
		while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;
		}
		System.out.println();
	}
	static LinkedListt<Integer> addNode(Scanner sc, LinkedListt<Integer> head){
		int pos;
		int count=1;
		LinkedListt<Integer> p=head;
		System.out.println("Enter the position: ");
		pos=sc.nextInt();
		System.out.println("Enter The Data Of New Node");
		LinkedListt<Integer> temp=new LinkedListt<>(sc.nextInt());
		if(pos==1){
			temp.next=head;
			return temp;
		}else{
			while(p.next!=null && count<pos-1){
				p=p.next;
				count++;
			}
			temp.next=p.next;
			p.next=temp;
		}
		return head;
	}
	static LinkedListt<Integer> delNode(Scanner sc,LinkedListt<Integer> head){
                int pos;
                int count=1;
                LinkedListt<Integer> p=head;
                System.out.println("Enter the position: ");
                pos=sc.nextInt();
			if(pos==1){
				head=head.next;
			}else{
				while(p.next!=null && p.next.next!=null && count<pos-1){
					p=p.next;
					count++;
			}
			p.next=p.next.next;
		}
		return head;
	}
}
