import java.util.*;

class Person{
	int age;
	String name;

	Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	void printData(){
		System.out.println(this.age+" "+this.name);
	}
}
