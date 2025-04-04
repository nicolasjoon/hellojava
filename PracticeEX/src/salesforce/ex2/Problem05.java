package salesforce.ex2;

public class Problem05 {
    v
    
        int[] num = new int[6];
        
        for (int i = 0; i < 6; i++) {
            int number;

            while (true) {
                number = (int)(Math.random() * 45) + 1;

                boolean run = false;
                for (int j = 0; j < i; j++) {
                    if (num[j] == number) {
                        run = true;
                        break;
                    }
                }
                if (!run) {
                    num[i] = number;
                    break;
                }
            }
        }
        System.out.println("미니 로또 번호: ");
        for (int number : num) {
            System.out.print(number + " ");
        }
    }
}
