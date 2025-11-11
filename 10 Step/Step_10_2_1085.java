import java.util.Scanner;

public class Step_10_2_1085 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        w = w - x;
        h = h - y;
        System.out.println(Math.min(Math.min(Math.min(w,h),x),y));

    }
}
