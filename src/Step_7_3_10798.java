import java.util.Scanner;

public class Step_7_3_10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] s = new char[5][15];


        for (int i = 0; i < 5; i++) {
            String s_ = sc.nextLine();
            for (int j = 0; j < s_.length(); j++) {
                s[i][j] = s_.charAt(j);            }
        }
        for (int i = 0; i < 15; i++) {
            for (int k = 0; k < 5; k++) {
                if (s[i][k] != '\0'){
                    System.out.print(s[k][i]);
                }
            }
        }

    }
}
