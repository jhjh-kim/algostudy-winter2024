import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10093 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long A=Long.parseLong(stringTokenizer.nextToken());
        long B=Long.parseLong(stringTokenizer.nextToken());
        long num=Math.abs(B-A)-1;

        if(num==0 || num==-1)
            System.out.println("0");

        else {
            System.out.println(num);
            for (int i = 1; i <= num; i++) {

                if (A > B)
                    System.out.print(B + i + " ");
                else
                    System.out.print(A + i + " ");
            }
        }
    }
}
