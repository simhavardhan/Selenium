package JavaLamadaClass;

import java.util.function.Predicate;

public class PredicateLamdaExpression {

	public static void main(String[] args) {
		
		//predicate interface contains test()
		//predicate interface lamdaexpression is used for applying conditions
		//returns boolean value 
		//accepts any type of parmeter
		
		Predicate<Integer> p = i -> (i%2==0);
		System.out.println(p.test(10));
		Predicate<String> p1 = (s) -> (s.length()>5);
		System.out.println(p1.test("Kona"));
	}

}
