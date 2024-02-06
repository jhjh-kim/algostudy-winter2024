import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class _10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        Integer []arr=new Integer[21];

        for (int i = 1; i <= 20; i++){
            arr[i]=Integer.valueOf(i);
        }
        for (int i = 0;i<10;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a=Integer.parseInt(stringTokenizer.nextToken());
            int b=Integer.parseInt(stringTokenizer.nextToken());
            int temp=0;
            for(int j=0;j<(b-a+1)/2;j++){
                temp=arr[a+j];
                arr[a+j]=arr[b-j];
                arr[b-j]=temp;
            }

        }

        for(int i = 1;i<=20;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
