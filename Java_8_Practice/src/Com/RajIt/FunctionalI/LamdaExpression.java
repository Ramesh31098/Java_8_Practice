package Com.RajIt.FunctionalI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class LamdaExpression {

	public static void main(String[] args) {
		Predicate<Integer> p = i-> i>10;
		boolean test = p.test(25);
		 System.out.println(test);
  List<String> asList = Arrays.asList("Rama","Shyama");
  Predicate<String>  P = asLi -> asLi.charAt(0)=='S';
  for (String as : asList) {
	System.out.println(P);
      }
	}
}
