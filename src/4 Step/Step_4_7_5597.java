import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_4_7_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] attd = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            attd[num] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            if(attd[i] == false){
             sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
