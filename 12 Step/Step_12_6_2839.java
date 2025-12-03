import java.util.Scanner;

public class Step_12_6_2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if(n % 5 == 0){
            System.out.println(n / 5);
            return;
        }
        while(n > 0){
            if(n < 15){
                if(n % 3 == 0){
                    System.out.print((n / 3) + count);
                    return;
                }
            }
            n = n -5;
            if(n < 0){
                System.out.print("-1");
                return;
            }
            count++;
        }


    }
}
