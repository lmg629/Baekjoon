import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_2_6_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int now_hour = Integer.parseInt(st.nextToken());
        int now_minute = Integer.parseInt(st.nextToken());
        int oven_time = Integer.parseInt(br.readLine());
        int result = now_minute + oven_time;
        if ( result >= 60 ){
            now_hour = now_hour + result/60;
            result = result%60;
        }
        now_hour = (now_hour >= 24) ?  now_hour - 24: now_hour;
        System.out.println(now_hour+ " " + result);
    }
}
