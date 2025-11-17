import java.util.Scanner;

public class Step_11_4_24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}
