package Java13;
import java.util.*;
public class Class14 {
	
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		try {
			int b = a.nextInt(); 
			if(b < 10) {
				throw new IntegerTooSmall();
			}
			else if(b > 70) {
				throw new IntegerTooLarge();
			}
			else {
				System.out.println(b);
			}
		}
		catch(IntegerTooSmall e) {
			System.out.println("您輸入的整數值太小");
		}
		catch(IntegerTooLarge e) {
			System.out.println("您輸入的整數值太大");
		}
		catch(InputMismatchException e) {
			System.out.println("您輸入不是整數");
		}
	}
}
class IntegerTooSmall extends Exception{
}
class IntegerTooLarge extends Exception{
}
