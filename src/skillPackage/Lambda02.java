package skillPackage;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda02 {
public static void main(String[] args) {
	
	ArrayList< Integer> arrayList = new ArrayList<>();
	
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(4);
	arrayList.add(5);
	// foreach method is used ?? so lambda expression is used in the lambda expression
	arrayList.forEach((A) -> System.out.println(A));

	// consumer interface class is used by the list 
	Consumer<Integer> consumer = (A) -> System.out.println(A);
//	arrayList.forEach(consumer);s
	
	System.out.println(arrayList);
	
}
}
