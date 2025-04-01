import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_3_4_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total_price = Integer.parseInt(br.readLine());
        int total_num = Integer.parseInt(br.readLine());
        int total = 0;


        for (int i = 0; i < total_num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            total = total + (price * quantity);
        }
        if (total == total_price) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
