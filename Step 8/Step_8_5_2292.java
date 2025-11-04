import java.util.Scanner;

public class Step_8_5_2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX_NUMBER = 1000000000;
        int max_size = 1;
        int min_size = 0;
        for (int i = 0; i < MAX_NUMBER / 6; i++) {
            max_size = max_size + (i * 6);
            min_size = max_size - (i * 6) + 1;
            if (i == 0){
                min_size = min_size -1;
            }
            if(min_size <= n & n <= max_size){
                System.out.println(i+1);
                break;
            }
        }

    }
}
