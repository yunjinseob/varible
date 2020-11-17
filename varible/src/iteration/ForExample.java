package iteration;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		 // sum=sum+10;
		for (int i=1; i<=10; i += 2) {//for은 반복문,//+=2 이거는 2씩 증가시키세요
			sum += 10;
			System.out.println("i: " + i);
		}
		System.out.println("sum:"+sum);
	}
	}
	
