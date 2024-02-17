//바킹독 풀이 참고
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[100001]; //수열의 크기는 최대 100000
        //자연수의 존재 여부를 저장하는 배열
        boolean[] occur=new boolean[2000001]; //기본값 false

        StringTokenizer st=new StringTokenizer(br.readLine());
        //수열 저장
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int x=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<n;i++){
            //x-arr[i]가 존재하는지 확인
            if (x-arr[i]>0 && occur[x-arr[i]]) {
                count++;
            }
            occur[arr[i]]=true; //arr[i]가 존재하니까 true
        }
        //결과 출력
        System.out.println(count);
    }
}