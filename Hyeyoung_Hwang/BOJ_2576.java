import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class BOJ_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, min = 100;
        int num;

        for (int i = 0; i < 7; i++) {
            num = Integer.parseInt(br.readLine());
            if((num % 2) == 1) {
                sum += num;
                if (num < min) {
                    min = num;
                }
            }

        }
        if(sum==0){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
