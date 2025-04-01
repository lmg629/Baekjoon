import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_4_10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        double avg = 0;
        int[] arr = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            max = Math.max(max, a);
        }
        for (int i = 0; i < M; i++) {
            double a = ((double)arr[i]/max) * 100;
            avg = avg + a;
        }
        System.out.println(avg/M);

    }
}
