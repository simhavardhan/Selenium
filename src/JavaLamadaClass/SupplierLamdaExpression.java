package JavaLamadaClass;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierLamdaExpression {

	public static void main(String[] args) {

		Supplier<Date> d = ()->new Date();
		System.out.println(d.get());
	}

}
