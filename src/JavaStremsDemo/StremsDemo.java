package JavaStremsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> bignames = new ArrayList<String>();
		names.add("Krishna");
		names.add("Govindha");
		names.add("simha");
		names.add("Jyo");
		names.add("knee");
		
//		for(String name : names) {
//			
//			if(name.length()>5) {
//				System.out.println(name);
//			}
//		}
		
		List<String> bigname = names.stream().filter(name->name.length()>5).collect(Collectors.toList());
		bignames.addAll(bigname);
		System.out.println(bigname);
		System.out.println(bignames);

	}

}
