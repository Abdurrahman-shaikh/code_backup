import java.util.*;

class SortDemo{
	public static void main(String[] args){
                ArrayList<Person> al = new ArrayList<>();
                al.add(new Person(10,"Mahesh"));
                al.add(new Person(20,"Amit"));
                al.add(new Person(15,"Sumit"));
                Collections.sort(al,new NameComparator());

		for(Person p : al){
			p.printData();
		}
        }

}
