import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int totalMinutes = A * 60 + B + C;
        
        // 시와 분 계산
        int endHour = (totalMinutes / 60) % 24; // 24로 나눈 나머지를 시로 사용하고, 24를 초과하는 경우 0부터 다시 시작
        int endMinute = totalMinutes % 60; // 60으로 나눈 나머지를 분으로 사용
        
        // 출력
        System.out.printf("%d %d\n", endHour, endMinute);
        sc.close();        
    }
}