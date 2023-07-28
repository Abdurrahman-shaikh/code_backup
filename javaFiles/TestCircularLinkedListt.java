import java.util.*;
class TestCircularLinkedListt{
	public static void main(String[] args){
		int option;
		CircularLinkedListt tail = null;
 		CircularLinkedListt head=null;
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("1.createList");
			System.out.println("2.traverseList");
			System.out.println("3.deleteList");
			System.out.println("10.exit");
			option =sc.nextInt();
			switch(option){
				case 1:
					head=CircularLinkedListt.create(sc);
					break;
				case 2:
					tail = CircularLinkedListt.traverse(head);
					break;
				case 3:
					head = CircularLinkedListt.delete(sc,head,tail);
					break;
				case 10:
					System.exit(0);
				default:
					System.out.println("wrong option");
			}
		}
	}
}
