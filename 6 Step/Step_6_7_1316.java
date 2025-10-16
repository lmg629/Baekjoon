import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_6_7_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] word = new boolean[26];
        boolean found = true;
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (word[s.charAt(j)-'a']) {
                    if (s.charAt(j) == s.charAt(j-1)){
                        continue;
                    }
                    found = false;
                    break;
                }
                word[s.charAt(j) - 'a'] = true;

            }
            if (found) {
                count = count + 1;
            }
            found = true;
            for (int k = 0; k < 26; k++) {
                word[k] = false;
            }

        }
        System.out.println(count);
    }
}
