package 练习题;
import java.util.Scanner;
public class 换个格式输出整数 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        String num;
        num = input.next();
        int i, t;
        t = num.length();
        if(t==3){
            a = num.charAt(0)-48;
            for(i=0;i<a;i++){
                System.out.print("B");
            }
            b = num.charAt(1)-48;
            for(i=0;i<b;i++){
                System.out.print("S");
            }
            c = num.charAt(2)-48;
            for(i=1;i<=c;i++){
                System.out.print(i);
                if(i==c){
                    System.out.println();
                }
            }
        }
       else if(t==2){
            b = num.charAt(0)-48;
            for(i=0;i<b;i++){
                System.out.print("S");
            }
            c = num.charAt(1)-48;
            for(i=1;i<=c;i++){
                System.out.print(i);
                if(i==c){
                    System.out.println();
                }
            }
        }
       else if(t==1){
            c = num.charAt(0)-48;
            for(i=1;i<=c;i++) {
                System.out.print(i);
                if (i == c) {
                    System.out.println();
                }
            }
        }
    }
}
