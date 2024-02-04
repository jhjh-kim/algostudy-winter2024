import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

//오름차순 정렬 : Arrays.sort(arr)
public class Bog_0x02_2752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
        }

    }
}
