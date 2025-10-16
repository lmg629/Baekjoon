import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_7_1_2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];
        int [][] arr2 = new int[N][M];
        int [][] sum = new int[N][M];

        loopArrary(br,arr1,N,M);
        loopArrary(br,arr2,N,M);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }


    public static void loopArrary(BufferedReader br, int[][] arrName, int firstLoop, int secondLoop) throws IOException {
        for (int i = 0; i < firstLoop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < secondLoop; j++) {
                arrName[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
