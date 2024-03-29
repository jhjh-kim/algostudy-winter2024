import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class BOJ_9498 {    //O(1)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(br.readLine());
        String answer ;

        if(grade>=90) {
            answer = "A";
        } else if (grade >= 80) {
            answer = "B";
        } else if (grade >= 70) {
            answer = "C";
        } else if (grade >= 60) {
            answer = "D";
        } else{
            answer = "F";
        }

        System.out.println(answer);
    }
}