package varible;

public class ConditionExample4 {
	public static void main(String[] args) {
		int num1 = 4;

		if (num1 % 15 == 0 && num1 % 5 == 0) {
			System.out.println("3과5의 공통배수입니다");
			
		} else if (num1 % 3 == 0) {
			System.out.println("3의배수입니다");

		} else if (num1 % 5 == 0) {
			System.out.println("5의배수입니다");

		} else {
			System.out.println("기타입니다");

		}
	}
}