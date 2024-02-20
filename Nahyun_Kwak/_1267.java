import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1267 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int Y=0;
        int M=0;
        int Y_Money=0;
        int M_Money=0;
        int Money;
        int N=Integer.parseInt(bufferedReader.readLine());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0;i<N;i++) {
            Money=Integer.parseInt(stringTokenizer.nextToken());
            Y_Money+=(Money/30+1)*10;
            M_Money+=(Money/60+1)*15;
        }
        if (Y_Money>M_Money){
            System.out.println("M "+ M_Money);
        }
        else if (Y_Money<M_Money)
            System.out.println("Y "+Y_Money);
        else
            System.out.println("Y M "+ M_Money);


    }
}
