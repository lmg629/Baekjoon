import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_6_6_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < word.length; i++) {
            if (input.contains(word[i])) {
                input = input.replace(word[i], ".");
            }
        }
        System.out.println(input.length());
    }
}