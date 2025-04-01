import java.io.*;
public class Step_3_11_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str=br.readLine()) != null) {
            int num1 = str.charAt(0) - 48;
            int num2 = str.charAt(2) - 48;
            sb.append(num1 + num2).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
