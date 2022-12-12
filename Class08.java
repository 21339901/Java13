package Java13;

public class Class08 {
	
	public static void main(String args[]) {
		try {
			Ctest.test(12, 0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("end of main()");		
	}
}
class Ctest{
	public static void test(int a,int b) throws ArithmeticException{//第七題
	    int num = a;
		int den = b;
		int ans = num / den;
	   }
}
