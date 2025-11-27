import java.util.Scanner;

public class Step_12_4_1018 {
    public static boolean[][] arr;

    public static void main(String[] args) {

        int count_print = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int repaint = countRepaint(i, j);
                count_print = Math.min(count_print, repaint);
            }
        }

        System.out.println(count_print);
    }

    public static int countRepaint(int a, int b) {
        int wFirst = 0;
        int bFirst = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean current = arr[a + i][b + j];

                boolean shouldBeW_whenWFirst = ((i + j) % 2 == 0);
                boolean shouldBeW_whenBFirst = ((i + j) % 2 != 0);

                if (current != shouldBeW_whenWFirst) {
                    wFirst++;
                }
                if (current != shouldBeW_whenBFirst) {
                    bFirst++;
                }
            }
        }

        return Math.min(wFirst, bFirst);
    }
}
