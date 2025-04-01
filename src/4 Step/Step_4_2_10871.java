import java.io.*;
import java.util.StringTokenizer;

public class Step_4_2_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[N1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < N2){
                sb.append(arr[i]).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
