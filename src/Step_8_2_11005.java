import java.util.Scanner;

public class Step_8_2_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_N = sc.nextInt();
        int number_B = sc.nextInt();

        System.out.println(Integer.toString(number_N,number_B).toUpperCase());

    }
}