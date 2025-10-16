import java.util.Scanner;

public class Step_7_2_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loc_max_c = 1;
        int loc_max_r = 1;
        int max = -1;
        int i;
        for (int t = 1; t <= 9; t++) {
            for (int j = 1; j <= 9; j++) {
                i = sc.nextInt();
                if (max < i){
                    loc_max_c = t;
                    loc_max_r = j;
                    max = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(loc_max_c + " " + loc_max_r);
    }
}
