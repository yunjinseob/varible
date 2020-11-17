package iteration;

public class ForMultiTable {
	public static void main(String[] args) {
		//For(9번 반복)
		int num = 2;
		for(int i=1; i <= 9; ++i) {
		
		System.out.println(num+"*" + i+ "="+(num*i));
		}



num++;
for(int i = 1; i <= 9; ++i) {

System.out.println("*" + i+ "="+(num*i));
}


for(int num1 = 2; num1 <= 9; num1 ++) {
	System.out.println("[" + num1+"]단");
for(int j =1; j <=9; j++) {
System.out.println(num1+" * " + j + " = "+(num1 * j));
}
}
}
}






