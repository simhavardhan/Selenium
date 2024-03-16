package JavaLamadaClass;

import java.util.function.Function;

public class FunctionalLamdaExpression {

	public static void main(String[] args) {
		
		//function interface contains apply() method
		//function interface lamdaexpression is used for performing an operation based on input value and it throws an outp
       // Accepts any type of input and gives any type of output
		Function<String,Integer> f = s1 -> s1.length();
		System.out.println(f.apply("Krishna"));
		
		Function<String,String> f1 = s2 -> s2.concat("Vardhan");
		System.out.println(f1.apply("Krishna"));
		
		//Function Chain
		
		Function <Integer, Integer> f2 = i -> i*2;
		Function <Integer, Integer> f3 = i -> i*i*i;
		System.out.println(f2.andThen(f3).apply(2));
		System.out.println(f2.compose(f3).apply(2));
	}

}
