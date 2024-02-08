import java.io.*;

public class BOJ_2446 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            sb.append(" ".repeat(i));
            for(int j=2*i+1;j<2*N;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=N-2;i>=0;i--){
            sb.append(" ".repeat(i));
            for(int j=2*(N-i)-1;j>0;j--){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }

}