import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Step_5_1_27866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        System.out.println(str.charAt(M-1));

    }
}
