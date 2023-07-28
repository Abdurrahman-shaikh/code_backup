import java.util.Comparator;

class ageComparator implements Comparator<Person>{
	public int compare(Person p1, Person p2){
		return p2.age-p1.age;
	}
}
