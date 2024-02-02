import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class _2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int arr[] = new int[4];


        for (int j = 0; j < 3; j++) {
            int front = 0;
            int back = 0;
            stringTokenizer= new StringTokenizer(bufferedReader.readLine());

            for (int i = 0; i < 4; i++) {
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());

                if (arr[i] == 0)
                    front++;
                else
                    back++;
            }

            if (front == 0)
                System.out.println("E");
            else if (front == 1)
                System.out.println("A");
            else if (front == 2)
                System.out.println("B");
            else if (front == 3)
                System.out.println("C");
            else
                System.out.println("D");

        }
    }
}
