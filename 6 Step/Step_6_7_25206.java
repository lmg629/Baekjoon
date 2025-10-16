import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_6_7_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalpoint = 0;
        double totalgrade = 0;
        for(int k = 0; k < 20; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")) {continue;}

            double b = Change(grade);
            totalpoint = (a * b) + totalpoint;
            totalgrade = a + totalgrade;
        }
        System.out.println(totalpoint/totalgrade);

    }
    public static double Change(String grade){
        switch(grade){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0;
        }
    }
}
