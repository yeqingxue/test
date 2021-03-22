package 练习题;
import java.util.Scanner;
public class 害死人不偿命的猜想 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        if(n==1){
            System.out.println(0);
        }
        else {
            do {
                if (n % 2 == 0) {
                    n = n / 2;
                    count++;
                } else if (n % 2 != 0) {
                    n = (3 * n + 1) / 2;
                    count++;
                }
            } while (n != 1);
            System.out.println(count);
        }
    }
}
