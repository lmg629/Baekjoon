import java.util.Scanner;

public class Step_8_3_2720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] money_box = new int[N][4];
        for (int i = 0; i < N; i++) {
            int money = sc.nextInt();
            money_box[i][0] = money / 25;
            money_box[i][1] = (money % 25) / 10;
            money_box[i][2] = (money % 25 % 10) / 5;
            money_box[i][3] = money % 25 % 10 % 5;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(money_box[i][j] + " ");
            }
            System.out.println();
        }


    }
}
