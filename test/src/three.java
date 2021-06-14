
public class three {
	public static void main(String[] args) {
		//１〜10までの偶数、奇数の和
		int oddN = 0;
		int evenN = 0;
		for(int i=0; i <=10; i ++) {
			if(i % 2 == 0) {
				evenN += i;
			} else {
				oddN += i;
			}
		}
		System.out.println("偶数は"+evenN+"奇数は"+oddN);
	}
}
