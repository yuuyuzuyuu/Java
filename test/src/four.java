
public class four {
	public static void main(String[] args) {
		//フィボナッチ数列
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		
		while(n1 <= 100) {
			System.out.print(n1+",");
			
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			
		}
	}
}
