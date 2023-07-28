import java.util.*;

class Constructor{
	int rno;
	String name;
	float marks;

	Constructor(){}

	Constructor(int rno, String name, int marks){
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}
}

class MainClass{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		Constructor n = new Constructor();
		System.out.println("Enter the name of the student");
		String name = sc.nextLine();
		System.out.println("Enter the rno");
		int rno = sc.nextInt();
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		Constructor n = new Constructor(rno, name, marks);
		System.out.println(n.rno);
		System.out.println(n.name);
		System.out.println(n.marks);
	}
}

