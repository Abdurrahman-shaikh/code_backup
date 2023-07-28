import java.util.*;

class LinkList{
	int data;
	LinkList next;
	LinkList(int data){
		this.data = data;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                LinkList head = null;
                LinkList p = null;
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++){
			LinkList temp = new LinkList(sc.nextInt());

			if(head == null){
				head = temp;
			}else{
			p = head;
				while(p.next != null){
					p = p.next;
				}
				p.next = temp;
			}
		}
		p = head;
		while(p != null){
			System.out.println(p.data);
                        p = p.next;
                }

	}
}
