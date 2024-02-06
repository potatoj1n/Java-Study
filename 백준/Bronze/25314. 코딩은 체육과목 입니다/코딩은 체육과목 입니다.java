import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div= N/4;
        for(int i=0; i <div;i++){
            System.out.print("long ");//줄바꿈 없이 출력
        }
        System.out.println("int");
        sc.close();
    }
}