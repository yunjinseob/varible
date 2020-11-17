package iteration;

public class ForMyExample {
	public static void main(String[] args) {
		int sum =0;
		for(int i =0; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
			if(sum % 2 ==0) {
		System.out.println("은짝수입니다");
			}else {
			
				System.out.println("은홀수입니다");
			}
           
           }
	
	
				
	}
}
