package varible;

public class ReferenceExample {
	public static void main(String[] args) {
		String str1 = "Hello";//주소값..
		String str2 = "Hello";//주소값..string 이 클래스 경우에 변수 str선언하면 실제 값ㅇ ㅣ아니라 주소 값이 당긴다
		String str3 = new String("Hello");//주소값..//그 주소값을 만드는게 new다 메모리에 가보면 찾지 못하지만
		if(str1 == str2) {//==는 주소값이 달라진다.
			System.out.print("동일한 주소값");
		}else {
			System.out.print("다른 주소값");
			
		}
	}
}
