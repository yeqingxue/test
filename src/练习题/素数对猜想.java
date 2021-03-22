package 练习题;
import java.util.Scanner;
public class 素数对猜想 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int d=2,i,j,t;
        int a=0;
        int count=0;
        int[] p = new int[100000];
        int N;
        p[0] = 2;
        p[1] = 3;
        N = input.nextInt();
        for(i=5;i<=N;i=i+2){
            if(i%3!=0) {
                for (t = 2; t <= Math.sqrt(i); t++) {
                    if (i % t == 0) {
                        a++;
                        continue;
                    }
                }
                if (a == 0) {
                    p[d] = i;
                    d++;
                }
            }
            a=0;
        }
        for(i=0;i<d-1;i++){
            if((p[i+1]-p[i])==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
