import java.util.*;
public class CircularLinkedListt{
	int data;
	CircularLinkedListt next;
	CircularLinkedListt tail;
	CircularLinkedListt(int x){
		data = x;
	}
	public static CircularLinkedListt create(Scanner sc){
		int n;
		System.out.println("Number of nodes");
		n = sc.nextInt();
		CircularLinkedListt tail = null;
		CircularLinkedListt head = null;
		CircularLinkedListt p = head;
		for(int j=1; j<=n; j++){
			int count = 1;
			System.out.println("Enter Data");
			CircularLinkedListt temp = new CircularLinkedListt (sc.nextInt());
			if(head == null){
				head = temp;
				tail = temp;
				//return head;
			}else{
				while(count <= n){
				tail.next=temp;
				tail = temp;
				tail.next = head;
				count++;
				}
			}
		}
		return head;
	}
	public static CircularLinkedListt delete(Scanner sc, CircularLinkedListt head, CircularLinkedListt tail){
		int pos;
		int count = 1;
		System.out.println("Enter the position");
		pos = sc.nextInt();
		CircularLinkedListt p=head;
		if(pos==1){
			tail.next = head.next;
			head = head.next;
			return head;
		}else{
			while(count < pos && p != tail){
				p=p.next;
				count++;
			}
			p.next=p.next.next;
		}
		return head;
	}
	public static CircularLinkedListt traverse(CircularLinkedListt head){
		CircularLinkedListt p =head;
		if(head != null){
			do{
				System.out.print(p.data +" ");
				p = p.next;
			}while(p != head);
		System.out.println();
		}
		return p;
	}
}
