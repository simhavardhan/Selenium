package JavaLamadaClass;

public class LamadaWithOutParameters {

	public static void main(String[] args) {
		
		vardhan va = ()->System.out.println("Add Method Executed");
		va.add();
	}
}

@FunctionalInterface
interface vardhan{
	
	public void add();
}

//class vardhanimp implements vardhan{
//
//	@Override
//	public void add() {
//		
//		System.out.println("Add Method Executed");		
//	}
//	
//	
//}
