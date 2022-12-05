package skillPackage;


@FunctionalInterface
interface StringFunction02 {
	  String run(String str);
	}

	public class Main02 {
	  public static void main(String[] args) {
	    StringFunction02 exclaim = (s) -> s + "!";
	    StringFunction02 ask = (s) -> s + "?";
	
	   
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	  }
	  public static void printFormatted(String str, StringFunction02 format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	}
