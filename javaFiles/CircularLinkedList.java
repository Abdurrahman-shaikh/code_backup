import java.util.*;
public class CircularLinkedList{
	int data;
	CircularLinkedList next;
	CircularLinkedList(int x){
		data = x;
		next = this;
	}
	public static CircularLinkedList create(Scanner sc){
		int n;
		System.out.println("Number of nodes");
		n = sc.nextInt();
		CircularLinkedList head = null;
		CircularLinkedList p = null;
		for(int i=1; i<=n; i++){
			System.out.println("Enter Data");
			CircularLinkedList temp = new CircularLinkedList (sc.nextInt());
			if(head == null){
				head = temp;
			}else{
				p = head;
				while(p.next != head){
					p=p.next;
				}
			temp.next = p.next;
			p.next = temp;
			}
		}
		return head;
	}
	public static void traverse(CircularLinkedList head){
		CircularLinkedList p =head;
		if(head != null){
			do{
				System.out.print(p.data +" ");
				p = p.next;
			}while(p != head);
		System.out.println();
		}
	}
	public static CircularLinkedList insertNode(Scanner sc, CircularLinkedList head){
		CircularLinkedList p = head;
		int pos,count = 1;
		System.out.println("Enter the position");
		pos=sc.nextInt();
		System.out.println("Enter the data");
		CircularLinkedList temp = new CircularLinkedList(sc.nextInt());
                if(pos == 1){
		while(p!=head)p=p.next;
//			temp.next=head;
//			p.next=temp;
//			head=temp;
			p.next = temp.next;
			temp.next = head;
			head = temp;
			return head;
                }
		while(count < pos && p!=head){
			count++;
			p=p.next;
		}
                temp.next=p.next;
                p.next=temp;
		return head;
	}
        public static CircularLinkedList delete(Scanner sc, CircularLinkedList head){
                int pos;
                int count = 1;
                System.out.println("Enter the position");
                pos = sc.nextInt();
                CircularLinkedList p=head;
                if(pos==1){
		while(p.next!=head)p=p.next;
//			p.next=head.next;
                        head = head.next;
			p.next = head;
                        return head;
                }else{
                        while(count < pos-1 && p.next!=head){
                                p=p.next;
                                count++;
                        }
                        p.next=p.next.next;
                }
                return head;
       }

}

