public interface InterfaceDemo_02{
	void printer();
}
class MyClass{
	void caller(InterfaceDemo_02 mi){
		mi.printer();
	}
}
