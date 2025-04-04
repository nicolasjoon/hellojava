package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
		//결합 산술연산으로 된 12랑 문자열 8하고 더한다 128 
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
		
		String a = "Hello, ";
		String b = "Java";
		String c = a + b;
		System.out.println(c);
		
		//10 + 10 = 20
		String str = "10";

		byte number = Byte.parseByte(str);
		System.out.println(number + number);
	}
}

//다 문자열로 봐버린다. 
//string의 리터럴 
//문자열로 결합
//큰 따옴표는 백슬래시 \\