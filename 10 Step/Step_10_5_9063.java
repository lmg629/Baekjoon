import java.util.Scanner;

public class Step_10_5_9063 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int extent_max_x = Integer.MIN_VALUE;
        int extent_max_y = Integer.MIN_VALUE;
        int extent_min_x = Integer.MAX_VALUE;
        int extent_min_y = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            extent_max_x = Math.max(extent_max_x,a);
            extent_max_y = Math.max(extent_max_y,b);
            extent_min_x = Math.min(extent_min_x,a);
            extent_min_y = Math.min(extent_min_y,b);
        }
        System.out.println((extent_max_x - extent_min_x) * (extent_max_y - extent_min_y));
    }
}
