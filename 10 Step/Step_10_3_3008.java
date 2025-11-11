import java.util.Scanner;

public class Step_10_3_3008 {
    public static int Square(int A, int B, int C) {
        int res = 0;
        if(A != B && A != C){
            res = A;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result_A = 0;
        int result_B = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int e = sc.nextInt();
        int f = sc.nextInt();

        result_A = Math.max(result_A, Square(a,c,e));
        result_A = Math.max(result_A,Square(c,a,e));
        result_A = Math.max(result_A,Square(e,a,c));

        result_B = Math.max(result_B, Square(b,d,f));
        result_B = Math.max(result_B,Square(d,b,f));
        result_B = Math.max(result_B,Square(f,b,d));

        System.out.println(result_A + " " + result_B);

    }

}
