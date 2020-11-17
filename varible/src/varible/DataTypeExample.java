package varible;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 127;	
		short num2 =128;
		int num3 = 1000000000;
		//아무말 없으면 인터형 정수
		long num4 =100000000000000L;
		byte val1 =10;
	
		num3 = val1;//promotion
		
		byte result = (byte) (num1 + val1); //casting
		num1 =120;// -128~127
		for(int i = 0; i < 20; i++) {
		System.out.print(num1++);
		}
		
		char char1 = 97;
		for(int i = 0; i < 26; i++)
		System.out.print(char1);
		
		float floatval = 4.567F;
		double doubleVal = 3.4567;
		
		}
		
	}

