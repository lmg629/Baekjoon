import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_5_5_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String Word = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 97; i < 123; i++) {
            String a = String.valueOf((char)i);
            sb.append(Word.indexOf(a)).append(" ");
        }
        System.out.println(sb);
    }
}
