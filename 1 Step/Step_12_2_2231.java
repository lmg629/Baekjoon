import java.util.Scanner;
import java.util.TreeMap;

public class Step_12_2_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int result = Integer.MAX_VALUE;
        boolean check = false;

        for (int i = n; i > 0; i--) {
            String s1 = Integer.toString(i);
            for (int j = 0; j < s1.length(); j++) {
                sum = sum + s1.charAt(j) - '0';;
            }
            if (sum + i == n){
                result = Math.min(result, i);
                check = true;
            }
            sum = 0;
        }
        if (!check){
            System.out.println(0);
            return;
        }
        System.out.println(result);
    }
}
