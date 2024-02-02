import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class _2752 {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A=Integer.parseInt(st.nextToken());
    int B=Integer.parseInt(st.nextToken());
    int C=Integer.parseInt(st.nextToken());

    if(A>B && A>C)
        if(B>C)
            System.out.println(C+" "+B+" "+A);
        else
            System.out.println(B+" "+C+" "+A);
    else if(B>A && B>C)
        if(A>C)
            System.out.println(C+" "+A+" "+B);
        else
            System.out.println(A+" "+C+" "+B);

    else
        if(A>B)
            System.out.println(B+" "+A+" "+C);
        else
            System.out.println(A+" "+B+" "+C);
    }




}
