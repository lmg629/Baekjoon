import java.io.*;
import java.util.StringTokenizer;

public class Step_4_1_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num_range = Integer.parseInt(br.readLine());
        int[] num_arr = new int[num_range];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num_range; i++) {
            num_arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num_range; i++) {
            if (num == num_arr[i]) {
                count = count + 1;
            }
        }
        bw.write(count + '\n');
        bw.flush();
        bw.close();
        br.close();
    }
}