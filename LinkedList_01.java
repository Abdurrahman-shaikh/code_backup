import java.util.*;
class LinkedListt<T>{
	T data;
	LinkedListt next;
	LinkedListt(T x){
		data = x;
	}
	public static LinkedListt createList(Scanner sc){
		int num_of_node;
		System.out.println("Enter the number of node to be created");
		num_of_node=sc.nextInt();
		LinkedListt<Integer> head=null;
		LinkedListt<Integer> p=null;
		for(int i=1; i<=num_of_node;i++){
			System.out.println("EnterData");
			LinkedList_01<Integer> temp=new LinkedList_01<>(sc.nextInt());
			if(i==1)head=temp;
			else{
				p=head;
				while(p.next!=null)p=p.next;
				p.next=temp;
			}
		}
		return head;
	}
	static void traverseList(LinkedListt head){
		while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;
		}
		System.out.println();
	}
	static LinkedListt addNode(Scanner sc, LinkedListt head){
		int pos;
		int count=1;
		LinkedListt<Integer> p=head;
		System.out.println("Enter the position: ");
		pos=sc.nextInt();
		System.out.println("Enter The Data Of New Node");
		LinkedListt temp=new LinkedListt(sc.nextInt());
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
	static LinkedListt searchElement(Scanner sc, LinkedListt head){
		int value;
		LinkedListt<Integer> p=head;
		System.out.println("Enter the number you wanto search");
		value=nextInt();
		while(p!=null){
			p=p.next;
			if(p==value){
				System.out.println("Number found at : "+value);
			}else{
				System.out.println("Number not found : ");
			}
		}
		return p;
	}
}
