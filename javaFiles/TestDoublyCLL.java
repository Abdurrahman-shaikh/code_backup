import java.util.*;
class TestDoublyCLL{
	public static void main(String[] args){
		int option;
		DoublyCLL tail = null;
 		DoublyCLL head=null;
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
					head=DoublyCLL.create(sc);
					break;
				case 2:
					DoublyCLL.traverse(head);
					break;
				case 3:
					head = DoublyCLL.insertNode(sc,head);
					break;
                                case 4:
                                        head = DoublyCLL.delete(sc,head);
                                        break;
				case 10:
					System.exit(0);
				default:
					System.out.println("wrong option");
			}
		}
	}
}
