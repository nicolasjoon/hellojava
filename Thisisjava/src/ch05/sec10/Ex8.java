package ch05.sec10;

public class Ex8 {
	public static void main(String[] args) {
		int[] [] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int tot = 0;
		double avg = 0;
		int count = 0;
		
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                tot += array[i][j];
                count++;
            }
        }
        
        avg = (double) tot / count;

        System.out.println("전체 합: " + tot);
        System.out.println("평균: " + avg); 
     }
}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                