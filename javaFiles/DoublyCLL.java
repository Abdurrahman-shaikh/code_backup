import java.util.*;

public class DoublyCLL {
	int data;
	DoublyCLL prev, next;

	DoublyCLL(int x) {
		data = x;
		prev = this;
		next = this;
	}

	public static DoublyCLL create(Scanner sc) {
		int num_of_node;
		System.out.println("Eneter number of node you want to create : ");
		num_of_node = sc.nextInt();
		DoublyCLL head = null;
		DoublyCLL p = head;
		for (int i = 1; i <= num_of_node; i++) {
			System.out.println("EnterData");
			DoublyCLL temp = new DoublyCLL(sc.nextInt());
			if (i == 1) {
				head = temp;
			} else {
				p = head;
				while (p.next != head)
					p = p.next;
				temp.next = head;
				p.next = temp;
				temp.prev = p;
				head.prev = temp;
			}
		}

		return head;
	}

	static DoublyCLL insertNode(Scanner sc, DoublyCLL head) {
		int pos;
		int count = 1;
		DoublyCLL p = head;
		System.out.println("Enter the position: ");
		pos = sc.nextInt();
		System.out.println("Enter The Data Of New Node");
		DoublyCLL temp = new DoublyCLL(sc.nextInt());
		if (pos == 1) {
			while (p.next != head)
				p = p.next;
			p.next = temp;
			temp.next = head;
			head.prev = temp;
			temp.prev = p;
			head = temp;
			return head;
		} else {
			while (count < pos - 1 && p.next != null) {
				p = p.next;
				count++;
			}
			p.next.prev = temp;
			temp.next = p.next;
			temp.prev = p;
			p.next = temp;
/*			if (temp.next == head) {
				temp.next.prev = temp;
				p.next = temp;
				temp.next = head;
				head.prev = temp;
			} */
		}
		return head;
	}

	public static void traverse(DoublyCLL head) {
		DoublyCLL p = head;
		if (p != null) {
			do {
				System.out.print(p.data + " ");
				p = p.next;
			} while (p.next != head);
			System.out.print(p.data);
		}
		System.out.println();
		while (p != head) {
			System.out.print(p.data + " ");
			p = p.prev;
		}
		System.out.print(p.data);
		System.out.println();
	}

	public static DoublyCLL delete(Scanner sc, DoublyCLL head){
		DoublyCLL p = head;
		int count=1;
		int pos;
		System.out.println("Enter the position of node");
		pos=sc.nextInt();
		if(pos == 1){
			while(p.next != head)
				p=p.next;
			p.next = head.next;
			head = head.next;
			head.prev = p;
		}else{
			while(p.next != head && count < pos-1){
				p = p.next;
				count++;
			}
			p.next = p.next.next;
			p.next.prev = p;
		}
		return head;
	}
}
