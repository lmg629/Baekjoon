import java.util.Scanner;

public class Step_9_5_2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int n_min = n;
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j = i * i; j <= n; j = j + i) {
                prime[j] = true;
            }
        }
        for(int i = m; i <= n; i++) {
            if(prime[i] == false) {
                count = count + i;
                n_min = Math.min(n_min, i);
            }
        }
        if(count == 0) {
            System.out.println("-1");
            return;
        }
        System.out.println(count);
        System.out.println(n_min);
    }
}
