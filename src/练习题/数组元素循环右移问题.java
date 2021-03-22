package 练习题;
import java.util.Scanner;
public class 数组元素循环右移问题 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[100];
        int N,M;
        N = input.nextInt();
        M = input.nextInt();
        for(int i = 0;i < N;i++){
            num[i] = input.nextInt();
        }
        if(N>=M) {
            for (int i = 0; i < N; i++) {
                if ((i - M) < 0) {
                    if (i == (N - 1)) {
                        System.out.println(num[N - M + i]);
                    } else {
                        System.out.print(num[N - M + i] + " ");
                    }
                } else {
                    if (i == (N - 1)) {
                        System.out.println(num[i - M]);
                    } else {
                        System.out.print(num[i - M] + " ");
                    }
                }
            }
        }else {
            M=M-N;
            for (int i = 0; i < N; i++) {
                if ((i - M) < 0) {
                    if (i == (N - 1)) {
                        System.out.println(num[N - M + i]);
                    } else {
                        System.out.print(num[N - M + i] + " ");
                    }
                } else {
                    if (i == (N - 1)) {
                        System.out.println(num[i - M]);
                    } else {
                        System.out.print(num[i - M] + " ");
                    }
                }
            }
        }
    }
}
