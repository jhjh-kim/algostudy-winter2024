import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int C=Integer.parseInt(br.readLine());
        String result=A*B*C + ""; //AxBxC 결과를 문자열로 변환.
        int[] arr=new int[10];

        for(int i=0;i<result.length();i++){
            char c=result.charAt(i); //문자열에서 각 문자 접근.
            int idx=c-'0'; //0을 빼주어 문자 c를 int로 변환.
            arr[idx]++; //각 문자를 arr배열의 인덱스 값으로 생각해 숫자의 개수 판단.
        }
        //결과 출력(Enhanced-For문)
        for(int v:arr){
            System.out.println(v);
        }

    }
}