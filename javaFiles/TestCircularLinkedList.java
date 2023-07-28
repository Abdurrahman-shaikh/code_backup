import java.util.*;
class TestCircularLinkedList{
	public static void main(String[] args){
		int option;
		CircularLinkedList tail = null;
 		CircularLinkedList head=null;
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("1.createList");
			System.out.println("2.traverseList");
			System.out.println("3.Insert Node");
			System.out.println("4.Delete Node");
			System.out.println("10.exit");
			option =sc.nextInt();
			switch(option){
				case 1:
					head=CircularLinkedList.create(sc);
					break;
				case 2:
					CircularLinkedList.traverse(head);
					break;
				case 3:
					head = CircularLinkedList.insertNode(sc,head);
					break;
				case 4:
					head = CircularLinkedList.delete(sc,head);
					break;
				case 10:
					System.exit(0);
				default:
					System.out.println("wrong option");
			}
		}
	}
}