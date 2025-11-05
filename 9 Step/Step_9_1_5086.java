import java.util.Scanner;

public class Step_9_1_5086 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1;
        while (a != 0 & b != 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            try {
                if (b % a == 0){
                    System.out.println("factor");
                    continue;
                }
                if (a % b == 0){
                    System.out.println("multiple");
                    continue;
                }
                System.out.println("neither");
            }
            catch (ArithmeticException e){
                continue;
            }

        }
    }
}
