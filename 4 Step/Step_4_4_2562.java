import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_4_4_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 9;
        int max = Integer.MIN_VALUE;
        int num_index = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
             max = num;
             num_index = i+1;
            }
        }
        System.out.println(max +"\n"+ num_index);
    }
}
