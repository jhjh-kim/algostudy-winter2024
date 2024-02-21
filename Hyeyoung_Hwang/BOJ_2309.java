import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum =0;
        int x=0, y=0;


        for(int i=0; i<9; i++){ //9개 입력 받음
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

/*
0 1 2 3 4 5 6 7 8  (9개)

            실제합 : 30
                근데 합이 20이었으면 좋겠어
                실제 합 - a - b = 20
                30 - 0(i) -1(i+1)
                        30 - 0 -2
                                30 - 0 - 3
                                        ... 30 - 0 -8(i+8)
                총 8번!

            30 -1 -2
                30 -1 -3
                        30 -1 -4
                                ... 30 - 1 - 8

            총 7번 !

            30 -2 -3
                30 -2 -4
                        30 -2 -5
                                ...
        총 6번!

            30 - 7 - 8
            한번!
*/

        for(int i=0; i<8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if ((sum - arr[i] - arr[j]) == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }

    }
}

