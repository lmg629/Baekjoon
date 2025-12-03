import java.util.Scanner;

public class Step_12_5_1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int def = 666;
        int count = 1;

        while(count != n){
            def = def + 1;
            if(String.valueOf(def).contains("666")){
                count++;
            }
        }
        System.out.println(def);


    }
}
