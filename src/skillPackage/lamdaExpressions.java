package skillPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lamdaExpressions {

	public static void main(String[] args) {
		ArrayList< Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(0);  
		
		System.out.println(arrayList);
		
		
		Consumer<Integer> method = (n) -> { System.out.println(n); };
//		arrayList.forEach(method);
		
		SumCalInterface obj = (a,b) -> System.out.println( a+b);
		obj.sum(10, 20);
		
		
	}
	
}
