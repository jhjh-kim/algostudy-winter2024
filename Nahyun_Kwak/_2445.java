import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class _2445 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i< N;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for (int j= 0;j<2*(N-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = 0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(i+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<N-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
