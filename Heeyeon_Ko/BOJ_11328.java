import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); //테스트 케이스
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String first=st.nextToken();
            String second=st.nextToken();

            //String을 char배열로
            char [] first_chars=first.toCharArray();
            char [] second_chars=second.toCharArray();

            //char배열 알파벳순으로 정렬
            Arrays.sort(first_chars);
            Arrays.sort(second_chars);

            //char배열을 다시 String으로
            String first_str=new String(first_chars);
            String second_str=new String(second_chars);

            //문자열 비교(결과 출력)
            if(first_str.equals(second_str))
                System.out.println("Possible");
            else
                System.out.println("Impossible");

        }
    }
}