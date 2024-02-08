import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        //9개의 수를 리스트에 저장
        for(int i=0;i<9;i++){
            list.add(Integer.parseInt(br.readLine()));
            sum+= list.get(i); //합계
        }
        int rem=sum-100; //다른 두명의 키 합
        loop1:
        for(int i=0;i<8;i++){
            loop2:
            for(int j=i+1;j<9;j++){
                if(list.get(i).intValue()+list.get(j).intValue()==rem){
                    //리스트의 크기 감소를 고려해 인덱스 j를 먼저 제거
                    list.remove(list.get(j));
                    list.remove(list.get(i));
                    break loop1;
                }
            }
        }
        //결과 출력
        Collections.sort(list);
        for(int i=0;i<7;i++){
            System.out.println(list.get(i));
        }

    }
}