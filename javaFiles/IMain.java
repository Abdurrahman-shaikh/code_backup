class IDemo implements InterfaceDemo_02 {
	public void printer() {
		System.out.println("Printer Method");
	}
}

class IMain {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		IDemo id = new IDemo();
		m1.caller(id);
	}
}
