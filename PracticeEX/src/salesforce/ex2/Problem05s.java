package salesforce.ex2;

public class Problem05s {
    public static void main(String[] args) {
     //로또 배열
        int[] lotto= new int[6];
        
        //로또 번호 생성
        	for (int i = 0; i < 6; i++) {
        		// 난수 발생
            lotto[i] = (int)(Math.random() * 45) + 1;
      
                // 이전 값과 비교  
            for (int j=0; j<i; j++) {
            	if(lotto[i] == lotto[j]) {
            		i--;
            		break;
            	}
             }
        	}
        	
        	// 로또 출력
        for (int num : lotto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
 }