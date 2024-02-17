import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String N= br.readLine();
        int[] arr=new int[9];
        //방 번호 숫자 개수를 배열에 입력
        for(int i=0;i<N.length();i++){
            int num=N.charAt(i)-'0';
            if(num==9) //9는 6으로 통일
                num=6;
            arr[num]++;
        }

        //6은 9와 통일했기 때문에 2로 나눴을 때 나머지만큼 또 필요한 세트수로 변경
        //제일 많이 필요한 숫자를 보기 위해 배열 정렬
        arr[6]=(arr[6]+1)/2;
        Arrays.sort(arr);
        System.out.println(arr[8]); //제일 큰 숫자 출력(결과 출력)

    }
}