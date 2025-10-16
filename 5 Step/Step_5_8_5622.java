import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_5_8_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String eng = br.readLine();
        int time = 0;
        int i = 0;

        while (i != eng.length()) {
            switch (eng.charAt(i)) {
                case 'A','B','C':
                    time = time + 3;
                    break;
                case 'D','E','F':
                    time = time + 4;
                    break;
                case 'G','H','I':
                    time = time + 5;
                    break;
                case 'J','K','L':
                    time = time + 6;
                    break;
                case 'M','N','O':
                    time = time + 7;
                    break;
                case 'P','Q','R','S':
                    time = time + 8;
                    break;
                case 'T','U','V':
                    time = time + 9;
                    break;
                case 'W','X','Y','Z':
                    time = time + 10;
                    break;
            }
            i = i + 1;
        }
        System.out.println(time);
    }
}
