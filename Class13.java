package Java13;
import java.util.*;
public class Class13 {
	
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		try {
			String b = a.next(); 
			if(b.equals("520")) {
				throw new Exception520();
			}
			else {
				System.out.println(b);
			}
		}
		catch(Exception520 e) {
			System.out.println("這是由字串520所引起的例外");
		}
	}
}
class Exception520 extends Exception{
}
