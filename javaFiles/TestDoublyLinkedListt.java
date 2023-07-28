import java.util.*;
class TestDoublyLinkedListt{
        public static void main(String[] args){
		int option;
		DoublyLinkedListt head=null;
		DoublyLinkedListt p=head;
                Scanner sc=new Scanner(System.in);
                while(true){
                        System.out.println("1. Create Linked List");
                        System.out.println("2.Traverse List");
			System.out.println("3.AddNode");
			System.out.println("4.delNode");
//			System.out.println("Create Circular Linked List");
                        System.out.println("10.exit");
                        option=sc.nextInt();
                        switch(option){
                        case 1:
        	        	head=DoublyLinkedListt.createListt(sc);
	                        break;
                        case 2:
                	        DoublyLinkedListt.traverseList(head);
                        	break;
			case 3:
				head=DoublyLinkedListt.addNode(sc,head);
				break;
			case 4:
				head=DoublyLinkedListt.deleteNode(sc,head);
				break;
//			case 5:
//				head = CircularLinkedListt.create(sc);
//				break;
                        case 10:
                        	System.exit(0);
                        default:
                        	System.out.println("Invalid Choice");
                        }

		}
	}
}

