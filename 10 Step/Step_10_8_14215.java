import java.util.Scanner;

public class Step_10_8_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = (a+b+c) - Math.max(Math.max(a, b),c);
        if(res > Math.max(Math.max(a, b),c)){
            System.out.println(a+b+c);
        }
        else{
            System.out.println(res + res - 1);
        }

    }
}
