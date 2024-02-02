import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _2576 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int arr[]=new int[7];
        int sum=0;

        for(int i=0;i<7;i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
            if(arr[i]%2!=0)
                list.add(arr[i]);
        }
        list.sort(Comparator.naturalOrder());
        if(list.size()==0)
            System.out.println("-1");
        else {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
