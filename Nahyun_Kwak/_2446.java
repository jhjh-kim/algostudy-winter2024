import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2446 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i<=N;i++){
            for(int j=1 ;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*(N-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N;i>1;i--){
            for(int j=1;j<i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*(N-i+2);j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
