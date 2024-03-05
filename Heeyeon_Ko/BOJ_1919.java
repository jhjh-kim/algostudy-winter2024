import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] alpha_count=new int[26]; //각 알파벳의 빈도 수 체크
        int result=0;

        char[] first_word=br.readLine().toCharArray();
        char[] second_word=br.readLine().toCharArray();

        for(char c:first_word){
            //첫번째 알파벳의 출현 빈도 체크(+1)
            //'a'의 아스키 코드는 97
            alpha_count[c-97]++;
        }
        for(char c:second_word){
            //두번째 알파벳의 출현 빈도 체크(-1)
            alpha_count[c-97]--;
        }
        for(int i=0;i<alpha_count.length;i++){
            //0인 경우는 알파벳 동일한 경우.
            //1 이거나 -1 인 경우의 빈도수를 합친 값.
            result+=Math.abs(alpha_count[i]);
        }
        System.out.println(result);
    }
}