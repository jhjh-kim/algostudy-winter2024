import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.concurrent.LinkedTransferQueue;

public class _2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine());

        for(int i = N;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        bufferedReader.close();
    }
}
