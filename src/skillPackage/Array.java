package skillPackage;

public class Array {

public static void main(String[] args) {
	int arr[]=new int[10];
	int[] ar = {1,2};
	System.out.println("print"+ar.clone());
	  
	int arr1[]= {1,5,7,8,9,10,1,2,7};
	int arr2[]= {6,8,9,9,1,0,19,2,8};
	int number[] = {11, 22, 33, 44, 55};
	
//	System.out.println(arr1.clone());
//	System.out.println(arr1.equals(arr2));
	
	for(int i =0;i<arr1.length;i++) {
//		System.out.println(arr1.hashCode());
		System.out.println(arr1[i]+arr2[i]);
		System.out.println(arr.length);
	}
}
}
