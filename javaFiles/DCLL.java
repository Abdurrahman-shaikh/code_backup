import java.util.*;

public class DCLL {
	int data;
	DCLL prev, next;

	DCLL(int x) {
		data = x;
		prev = null;
		next = this;
	}

	public static DCLL create(Scanner sc) {
		int num_of_node;
		System.out.println("Eneter number of node you want to create : ");
		num_of_node = sc.nextInt();
		DCLL head = null;
		DCLL p = head;
		for (int i = 1; i <= num_of_node; i++) {
			System.out.println("EnterData");
			DCLL temp = new DCLL(sc.nextInt());
			if (i == 1) {
				head = temp;
			} else {
				p = head;
				while (p.next != head)
					p = p.next;
				p.next = temp;
				temp.prev = p;
				temp.next = head;
			}
		}

		return head;
	}

	static DCLL insertNode(Scanner sc, DCLL head) {
		int pos;
		int count = 1;
		DCLL p = head;
		System.out.println("Enter the position: ");
		pos = sc.nextInt();
		System.out.println("Enter The Data Of New Node");
		DCLL temp = new DCLL(sc.nextInt());
		if (pos == 1) {
			while (p.next != head)
				p = p.next;
			p.next = temp;
			temp.next = head;
			head = temp;
			return head;
		} else {
			while (count < pos - 1 && p.next != null) {
				p = p.next;
				count++;
			}
			temp.next = p.next;
			temp.prev = p;
			p.next = temp;
			if (temp.next != null) {
				temp.next.prev = temp;
			}
		}
		return head;
	}

	static void traverse(DCLL head) {
		DCLL p = head;
		if (p != null) {
			do {
				System.out.print(p.data + " ");
				p = p.next;
			} while (p.next != head);
//			System.out.print(p.data);
		}
		System.out.println();
		while (p.prev != null) {
			System.out.print(p.data + " ");
			p = p.prev;
		}
		System.out.print(p.data);
		System.out.println();
	}

}
