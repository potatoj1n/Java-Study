import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        // 테스트 케이스마다 A+B 계산하여 출력
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            // A+B를 계산하여 BufferedWriter에 출력
            bw.write((A + B) + "\n");
        }
        
        // BufferedWriter의 내부 버퍼에 있는 데이터를 출력
        bw.flush();
        
        // 스트림 닫기
        br.close();
        bw.close();
    }
}

