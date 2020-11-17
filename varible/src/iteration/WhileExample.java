package iteration;

public class WhileExample {
	public static void main(String[] args) {

		int i = 0, sum = 0;

		while (true) {
			sum += i;
			i++;
			if (i == 10) {
				break;
			}
			i++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.println("*");

			}
			System.out.println();
		}
	}
}
