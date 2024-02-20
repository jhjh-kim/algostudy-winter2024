import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10804 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] card={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<10;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken())-1; //4
            int end=Integer.parseInt(st.nextToken())-1; //9
            for(int j=0;j<(end-start+1)/2;j++){
                int temp=card[start+j]; //temp=card[4]
                card[start+j]=card[end-j]; //card[4]=card[9]
                card[end-j]=temp;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<20;i++){
            sb.append(card[i]+" ");
        }
        System.out.println(sb);


    }

}