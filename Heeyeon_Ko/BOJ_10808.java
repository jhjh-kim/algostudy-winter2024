import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine();
        int[] freq=new int[26]; //알파벳 개수를 저장할 배열

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i); //문자열에서 각 문자 접근
            //'a'의 아스키코드 값은 97, 'b'는 98..
            //각 문자의 아스키코드 값을 계산하여 'a'를 뺀 값을 인덱스로 사용
            freq[c-'a']++;
        }
        //개수 출력
        for(int i=0;i<26;i++){
            System.out.println(freq[i]);
        }
    }
}




