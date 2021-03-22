package 练习题;

import java.math.BigDecimal;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        int t = 0;
        n = input.nextInt();
        m = input.nextInt();
        int[] num = new int[100000];
        int[] p = new int[100000];
        for(int i = 0;i<n;i++){
            num[i] = input.nextInt();
        }
        for(int a=0;a<n-2;a++){
            for(int j=a+1;j<n-1;j++) {
                p[t] = Math.abs(num[j] - num[a]);
                t++;
            }
        }
        long aum=1;
        for(int i = 0;i<t;i++){
            aum = aum*p[i];
        }
        System.out.println(t);
        long d;
        d = aum%m;
        System.out.println(d);

    }
}
