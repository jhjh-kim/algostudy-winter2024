import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(br.readLine());
        int sum_Y=0; //영식 요금제
        int sum_M=0; //민식 요금제

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(st.nextToken());
            sum_Y+=(num/30+1)*10;
            sum_M+=(num/60+1)*15;
        }
        //결과 출력
        if(sum_Y<sum_M){
            sb.append("Y ");
            sb.append(sum_Y);
        }
        else if(sum_M<sum_Y){
            sb.append("M ");
            sb.append(sum_M);
        }
        else{
            sb.append("Y M ");
            sb.append(sum_Y);
        }
        System.out.println(sb);
    }
}