package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b; 
		System.out.println("y: " + y);
		
		int a = 0;
		System.out.println("a :" + a++);
		System.out.println("a :" + ++a);
	}
}


//증감연산자는 값을 변화를 시켜준다. 