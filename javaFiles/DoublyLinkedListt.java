
public class DoublyLinkedListt {
	int data;
	DoublyLinkedListt prev,next;
	DoublyLinkedListt(int x){
		data=x;
		prev=null;
		next=null;
	}

	public static DoublyLinkedListt createListt(Scanner sc) {
		int num_of_node;
		System.out.println("Enter number of node you want to create : ");
		num_of_node = sc.nextInt();
		DoublyLinkedListt head = null;
		DoublyLinkedListt p = head;
		for (int i = 1; i <= num_of_node; i++) {
			System.out.println("EnterData");
			DoublyLinkedListt temp = new DoublyLinkedListt(sc.nextInt());
			if (i == 1) {
				head = temp;
			} else {
				p = head;
				while (p.next != null){
					p = p.next;
				}
				p.next = temp;
				temp.prev = p;
			}
		}
		return head;
	}

	static DoublyLinkedListt addNode(Scanner sc, DoublyLinkedListt head) {
		int pos;
		int count = 1;
		DoublyLinkedListt p = head;
		System.out.println("Enter the position: ");
		pos = sc.nextInt();
		System.out.println("Enter The Data Of New Node");
		DoublyLinkedListt temp = new DoublyLinkedListt(sc.nextInt());
		if (pos == 1) {
			temp.next = head;
			head.prev = temp;
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

	static DoublyLinkedListt deleteNode(Scanner sc, DoublyLinkedListt head) {
		System.out.println("Enter the position");
		int pos = 1;
		int count = 1;
		pos = sc.nextInt();
		DoublyLinkedListt p = head;
		if(pos==1){


