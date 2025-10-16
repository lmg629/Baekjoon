import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_3_5_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_byte = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("long int");

        for (int i = 1; i < num_byte/4; i++) {
            sb.insert(0,"long ");
        }
        System.out.println(sb);
    }
}
