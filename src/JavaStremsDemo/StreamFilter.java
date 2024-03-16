package JavaStremsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(10,15,20,25,30,35,40,45,50,55);
		List<Integer> numberList2= Arrays.asList(12,30,5,80,50,30,47,83,27,54);
		List<Integer> dis=Arrays.asList(20,30,30,45,45,90,22,22);
		List<List<Integer>> numbersLists = Arrays.asList(numberList,numberList2);
		
		//Non Terminal Operations
		//filter
		//map
		//flatmap
		//limit
		//distinct
		
		//Terminal Opeerations
		//Max
		//Min
		//foreach
		//collect
		//reduce
		//count
		//toarray

		numberList.stream().filter(name->name%2==0).forEach(nam->System.out.println(nam));
		numberList.stream().map(number->number*number).forEach(namee->System.out.println(namee));

		List TwoListevens=numbersLists.stream().flatMap(number->number.stream()).filter(num->num%2==0).collect(Collectors.toList());

		System.out.println(TwoListevens);

		Optional<Integer> min =	numbersLists.stream().flatMap(number->number.stream()).min((value1,value2) -> {return value1.compareTo(value2);});
		System.out.println(min.get());


		Optional <Integer> max=numbersLists.stream().flatMap(number->number.stream()).max((value1,value2) -> {return value1.compareTo(value2);});
		System.out.println(max.get());

		Optional <Integer> maxinfirstlist = numberList.stream().max((value1,value2) ->  {return value1.compareTo(value2);});
		System.out.println(maxinfirstlist.get());

		List value = dis.stream().distinct().collect(Collectors.toList());

		System.out.println(value);
		
		List Value1=dis.stream().limit(4).collect(Collectors.toList());
		System.out.println(Value1);
		
		long Value2=dis.stream().limit(4).count();
		System.out.println(Value2);

	}

}
