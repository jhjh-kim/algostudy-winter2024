import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class _2309 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int []arr=new int[9];
        int []total_arr=new int[7];



        for(int i = 0;i<9;i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
        }

        for(int i=0;i<8;i++){
            int total=0;
            for(int j=i+1;j<9;j++){
                total=0;

                for(int k=0, a=0;k<9;k++){
                    if(k!=i && k!=j)
                        total_arr[a++]=arr[k];
                }
                for(int a=0;a<7;a++){
                    total+=total_arr[a];

                }
                if(total==100)
                    break;

            }
            if(total==100)
                break;
        }
        Arrays.sort(total_arr);
        for(int i = 0;i<7;i++)
            System.out.println(total_arr[i]);


    }
}
