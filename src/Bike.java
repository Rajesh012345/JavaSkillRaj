//import java.util.Scanner;
//public class Scanner1 {
//
//	
////final static  int a=10;
//	
//	public static void main(String[] args) {
//		
////		Scanner sc =  new Scanner(System.in); 
////		System.out.println("enter yourname");
////		
////		String name = sc.nextLine();
////		System.out.println(name);
//	final	 int a = 0;
//		
//		System.out.println(a);
//		//a=12;
////		System.out.println(a=12);
//		
//	}
//}

 class Bike{  
final   void run(int a){System.out.println("running "+a
		   );}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda = new Honda();  
   honda.run();  
   
   Bike bike= new Bike();
   bike.run(0);
   }  
} 




