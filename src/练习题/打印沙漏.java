package 练习题;
import java.util.Scanner;
public class 打印沙漏 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        char ch;
        int t;
        int N, num = 0;
        int k = 0, m;
        int tou = 0, wei = 0;
        N = input.nextInt();
        ch = input.next().charAt(0);
        int i , j;
        for(i = 0;num < N;i++){
           num = (i+1)*(i+1)*2-1;
           if(num > N){
               t=i*i*2-1;
               k = N-t;
               count = i;
           }
           else if(num == N){
               count = i+1;
           }
        }
        m = count * 2 - 1;
        wei = count * 2 - 1 - 1;
        for(i=count;i>0;i--){
            for(j = 0;j < m;j++){
                if(j>=tou&&j<=wei){
                    System.out.print(ch);
                    if(j==wei){
                        System.out.println();
                        break;
                    }
                }
                else if(j<tou) {
                    System.out.print(' ');
                }
            }
            tou++;
            wei--;
        }
        tou--;
        wei++;
        for(i=2;i<=count;i++){
            tou--;
            wei++;
            for(j = 0;j < m;j++){
                if(j>=tou&&j<=wei){
                    System.out.print(ch);
                    if(j==wei){
                        System.out.println();
                        break;
                    }
                }
                else if(j<tou){
                    System.out.print(' ');
                    }
                }
        }
        if(k!=0){
            System.out.println(k);
        }
    }
}
