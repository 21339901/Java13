package Java14;

public class Class02 {

	public static void main(String args[]) {
		int num = 12;
		int den = 0;
		if(den == 0) {
			System.out.println("除數為零");
		}
		else {
			int ans = num / den;
			System.out.println(ans);
		}
		System.out.println("end of main()!!");
		
	}
}
//1.(a) 會
//1.(b) 算數錯誤 任意數字無法除以0
//1.(c) 不會 在第七行時就會發生錯誤所以程式會中止不會執行第7行
