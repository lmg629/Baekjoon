import java.util.Scanner;

public class Step_8_4_2903 {
    public static void main(String[] args) {

        int square_Oneline_point_default = 2;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int point = square_Oneline_point_default;
        for (int i = 0; i < num; i++) {
            point = (int)Math.pow(2,i) + point;
        }
        System.out.println(point*point);
    }
}
