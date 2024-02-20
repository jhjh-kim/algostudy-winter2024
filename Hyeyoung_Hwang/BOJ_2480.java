import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int grade = 0;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == b && b == c) {
            grade = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            grade = 1000 + (a * 100);
        } else if (b == c) {
            grade = 1000 + (b * 100);
        } else {
            int max = Math.max(c, Math.max(a, b));
            grade = max * 100;
        }
        System.out.println(grade);
    }
}
