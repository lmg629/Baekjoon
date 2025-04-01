import java.io.*;

public class Step_3_9_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int star_num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= star_num; i++) {
            bw.write(" ".repeat((star_num - i)) + "*".repeat(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
