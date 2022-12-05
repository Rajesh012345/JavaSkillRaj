package skillPackage;

public class Prog001 {


	public static void main(String[] args) {
		String name = "Rajesh";
//		String state = "Andhra Pradesh";
		

		
		System.out.println(name);
		char[] chars = name.toCharArray();
		
//System.out.println(state);
//		char[] charArray = state.toCharArray();
		
String reverseName = ""  ;		
//		String revState = "";
		
for (char c : chars) {
	reverseName=c+reverseName;
	System.out.println(c+reverseName);
	
}
System.out.println(reverseName);
//		for(char ch : charArray) {
//			revState = ch + revState;
//		}
//		
//		System.out.println(revState);
//	}
	}
}

