package JavaLamadaClass;

import java.util.function.Consumer;

//import java.util.function.*;

public class ConsumerLamdaExpression {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Govindha");
		Consumer<Integer> c1 = i-> System.out.println(i);
		c1.accept(10);
				
				
	}

}
