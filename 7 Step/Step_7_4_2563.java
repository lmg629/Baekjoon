import java.util.Scanner;

public class Step_7_4_2563 {


    public static void main(String[] args) {
        boolean[][] drawing_paper = new boolean[100][100];
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int area = 0;
        for (int i = 0; i < number; i++) {

            int y = sc.nextInt();
            int x = sc.nextInt();

            for (int k = y; k < y + 10; k++) {
                for (int l = x; l < x + 10; l++) {
                    drawing_paper[k][l] = true;
                }
            }
        }
        for (int n = 0; n < 100; n++) {
            for (int m = 0; m < 100; m++) {
                if (drawing_paper[n][m]) {
                    area = area + 1;
                }
            }
        }
        System.out.println(area);
    }
}
