import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
       M -= 45;
        if (M < 0) {
            H = (H == 0) ? 23 : H - 1;
            M += 60;
        }
        
        System.out.printf("%d %d", H ,M);
        sc.close();
    }
}