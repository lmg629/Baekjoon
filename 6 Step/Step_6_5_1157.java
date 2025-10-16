import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Step_6_5_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] eng = new int[26];
        int max = 0;
        int res = 0;
        char ch = '?';
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if(65 <= word.charAt(i) && word.charAt(i) <= 90){
                eng[word.charAt(i) - 'A']++;
            } else if (97 <= word.charAt(i) && word.charAt(i) <= 122) {
                eng[word.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max == eng[i]){
                flag = false;
            }
            else if (max < eng[i]){
                flag = true;
                res = i;
            }
            max = Math.max(eng[i], max);
        }
        if (flag){
            ch = (char) ((char) res + 65);
        }
        System.out.println(ch);
    }
}
