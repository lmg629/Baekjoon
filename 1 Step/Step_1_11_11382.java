import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_1_11_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        long num = (input.length > 0) ? Long.parseLong(input[0]) : 0;
        long num1 = (input.length > 1) ? Long.parseLong(input[1]): 0;
        long num2 = (input.length > 2) ? Long.parseLong(input[2]): 0;
        System.out.println(num+num1+num2);

    //var = expression1(if) ? expression2(True) : expression3(False);
    }

}
