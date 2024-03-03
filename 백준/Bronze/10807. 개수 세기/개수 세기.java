import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        int N = Integer.parseInt(br.readLine()); // 정수의 개수 N
        String[] inputs = br.readLine().split(" "); // 정수들을 공백으로 구분하여 입력 받음
        int[] intAry = new int[N];
        for (int i = 0; i < N; i++) {
            intAry[i] = Integer.parseInt(inputs[i]); // 정수 배열에 입력된 정수들 저장
        }
        int V = Integer.parseInt(br.readLine()); // 찾으려는 정수 V
        
        // 정수 배열에서 V가 몇 개 있는지 세기
        int count = 0; 
        for(int i=0; i < N; i++){
            if(intAry[i] == V){
                count++;
            }
        }
        
        br.close();
        System.out.println(count); // 결과 출력
    }
}

