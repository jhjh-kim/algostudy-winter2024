import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class _2587 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];
        int sum=0;
        int avg;

        for(int i = 0;i<5;i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
            sum+=arr[i];
        }
        avg=sum/5;
        Arrays.sort(arr);
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}
