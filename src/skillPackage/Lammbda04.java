package skillPackage;

interface Single {
	double getpivalue();

}

public class Lammbda04 {
	public static void main(String[] args) {

		Single single;
		single = () -> 34.123;
		System.out.println(single.getpivalue());

	}
}
