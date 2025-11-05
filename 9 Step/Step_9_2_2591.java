import java.util.Scanner;

public class Step_9_2_2591 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if(a % i == 0){
                count++;
            }
            if(b == count){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
