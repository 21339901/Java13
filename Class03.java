package Java14;

public class Class03 {

	public static void main(String args[]) {
		int num = 12;
		int den = 0;
		try {
			int ans = num / den;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("end of main()!!");
		}
	}
}
