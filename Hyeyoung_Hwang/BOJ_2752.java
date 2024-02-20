import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//오름차순 정렬 : Arrays.sort(arr)
public class BOJ_2752 {
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
