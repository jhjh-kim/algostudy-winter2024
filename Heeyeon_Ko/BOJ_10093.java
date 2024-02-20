import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10093 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long first=Long.parseLong(st.nextToken());
        long second=Long.parseLong(st.nextToken());
        if(first==second)
            System.out.println(0);

        else if(first<second){
            System.out.println(second-first-1);
            StringBuilder sb=new StringBuilder();
            for(long i=first+1;i<second;i++){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }

        else if(first>second){
            System.out.println(first-second-1);
            StringBuilder sb=new StringBuilder();
            for(long i=second+1;i<first;i++){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }


    }

}