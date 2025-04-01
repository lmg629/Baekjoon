import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_3_3_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= num; i++){
            result = i + result;
        }
        System.out.println(result);
    }
}
