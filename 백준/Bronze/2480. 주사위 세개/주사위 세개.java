import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int price = 0;
        // 같은 눈이 3개가 나온 경우
        if (A == B && B == C) {
            price = 10000 + A * 1000;
        } 
        // 같은 눈이 2개만 나온 경우
        else if (A == B || A == C || B == C) {
            if (A == B || A == C) {
                price = 1000 + A * 100;
            } else {
                price = 1000 + B * 100;
            }
        } 
        // 모두 다른 눈이 나온 경우
        else {
            int maxDice = Math.max(A, Math.max(B, C)); // 가장 큰 눈 계산
            price = maxDice * 100;
        }
        // 출력
        System.out.println(price);
        sc.close();        
    }
}