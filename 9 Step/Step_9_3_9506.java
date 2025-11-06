import java.util.Scanner;

public class Step_9_3_9506 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("1");
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int check = 1;
            if(n == -1){
                return;
            }
            for (int i = 2; i < n; i++) {
                if(n % i == 0){
                    sb.append(" + " + i);
                    check = check + i;
                }
            }
            if(check != n){
                System.out.println(n + " is NOT perfect.");
            }
            else{
                System.out.println(n +" = "+ sb);
            }
            check = 0;
            sb.setLength(1);
        }
    }
}
