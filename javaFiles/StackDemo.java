import java.util.Stack;

class StackDemo{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		while(!st.empty()){
			System.out.println(st.pop());
		}
	}
}
