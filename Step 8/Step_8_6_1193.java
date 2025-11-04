import java.util.Scanner;

public class Step_8_6_1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int left_num = 1;
        int right_num = 1;
        int num = 1;
        boolean check = true;

        for (int i = 0; i < N-1; i++) {
            if (check) {
                if (right_num == num) {
                    right_num++;
                    check = false;
                    num++;
                    continue;
                }
                left_num = left_num - 1;
                right_num = right_num + 1;

            } else {
                if (left_num == num) {
                    left_num++;
                    check = true;
                    num++;
                    continue;
                }
                right_num = right_num - 1;
                left_num = left_num + 1;
            }
        }
        System.out.println(left_num + "/" + right_num);


    }
}
