import java.util.*;
class TestLinkedList{
	public static void main(String[] args){
		int option;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1. Create Linked List");
                        System.out.println("2.Traverse List");
                        System.out.println("10.exit");
			option=sc.nextInt();
			switch(option){
			case 1:
			System.out.println("Case1");
			break;
			case 2:
			System.out.println("Case2");
			break;
			case 10:
			System.exit(0);
			default:
			System.out.println("Invalid Choice");
			}
		}
	}
}
