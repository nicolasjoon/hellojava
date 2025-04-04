package salesforce.ex2;

public class Problem01 {

	public static void main(String[] args) {
		int[] date = {1,3,5,8,9,11,15,19,18,20,30,33,31};
				
		int sum = 0;
		int count = 0;
		
		for (int num : date) {
		 if(num % 3 == 0) {
			 sum += num;
			 count++;
		 }
	}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " +sum);
	}
}

//문제 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 그 합을 아래와 같이 출력하는 프로그램을 작성하세요.

//나머지가 0인가 체크 하는거 0이면 3의 배수

