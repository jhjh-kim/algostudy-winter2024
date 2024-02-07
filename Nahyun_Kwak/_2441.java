import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class _2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < N; i++){
            for(int j=0; j < i; j++){
                System.out.print(" ");
            }
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
