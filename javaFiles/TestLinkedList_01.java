import java.util.*;
class TestLinkedListt{
        public static void main(String[] args){
		int option;
		LinkedListt<Integer> head=null;
                Scanner sc=new Scanner(System.in);
                while(true){
                        System.out.println("1. Create Linked List");
                        System.out.println("2.Traverse List");
			System.out.println("3.AddNode");
			System.out.println("4.delNode");
                        System.out.println("10.exit");
                        option=sc.nextInt();
                        switch(option){
                        case 1:
        	        	head=LinkedListt.createList(sc);
	                        break;
                        case 2:
                	        LinkedListt.traverseList(head);
                        	break;
			case 3:
				head=LinkedListt.addNode(sc,head);
				break;
			case 4:
                                head=LinkedListt.delNode(sc,head);
                                break;
                        case 10:
                        	System.exit(0);
                        default:
                        	System.out.println("Invalid Choice");
                        }

		}
	}
}
