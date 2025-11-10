import java.util.Scanner;

public class Step_9_6_11653 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        if(n == 1){
            return;
        }
        while (n != 1) {
            if (n % i != 0){
                i++;
            }
            else {
                System.out.println(i);
                n = n / i;
            }
        }
    }
}
