package Com.RajIt.FunctionalI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		person p1= new person(01,"Ramesh");
		person p2= new person(02,"Ram");
		person p3= new person(03,"Shyam");
		
		List<person> persons = Arrays.asList(p1,p2,p3);
		Predicate<person> predicate=p->p.id==2;
		 for (person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person.Name);
			}
		}
		
	}

}

class person{
	int id;
	String Name;
	
	public person(int id, String Name) {
		this.id=id;
		 this.Name= Name;
	}
}
