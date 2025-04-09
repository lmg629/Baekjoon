import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_6_3_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());
        for (int i = 1; i <= S; i++) {
            System.out.println(" ".repeat(S-i)+ "*" +"*".repeat(2 * (i-1)));
        }
        for (int i = S-1; i > 0; i--) {
            System.out.println(" ".repeat(S-i)+ "*" + "*".repeat(2 * (i-1)));
        }
    }
}
