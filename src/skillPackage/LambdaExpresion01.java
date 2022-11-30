package skillPackage;

public class LambdaExpresion01 {
public static void main(String[] args) {
	
//	Calculator addition = new Calculator();
//	addition.add(23, 45);
//	System.out.println(addition.toString());
	
	SumCalInterface  sum = (a,b) -> System.out.println( a+b);
	sum.sum(10, 20);
	
	
}
}
