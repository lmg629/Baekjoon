import java.util.Scanner;

public class Step_10_7_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            else if(a==b && a==c && b==c){
                sb.append("Equilateral\n");
            }
            else if(Math.max(Math.max(a,b),c) >= (a+b+c) - Math.max(Math.max(a,b),c)){
                sb.append("Invalid\n");
            }
            else if(a==b || a==c || b==c){
                sb.append("Isosceles\n");
            }
            else{
                sb.append("Scalene\n");
            }
        }
        System.out.println(sb);
    }
        }

