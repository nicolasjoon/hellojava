package ch05.sec10;

public class Ex8s {
	public static void main(String[] args) {
		int[] [] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
	    int tot = 0;
	    double avg = 0;
	    int cnt = 0;
	    
	    // 전체 합과 평균을 출력하는 프로그램 완성
	    for(int i=0; i<array.length; i++) {
	      cnt += array[i].length;
	      //System.out.println( "cnt = " + cnt ); 
	      for(int j=0; j<array[i].length; j++) {
	        tot += array[i][j];
	        //System.out.println( "tot = " + tot ); 
	      }
	    }
	    
	    avg = (double)tot / cnt;
	    System.out.println( "tot = " + tot ); 
	    System.out.println( "avg = " + avg ); 
	  }
	}