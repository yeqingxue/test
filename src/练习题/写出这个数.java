package 练习题;
import java.util.Scanner;
public class 写出这个数 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num;
        num = input.next();
        int sum = 0;
        int i;
        String s;
        for(i=0;i<num.length();i++){
            sum = sum + (num.charAt(i)- 48);
        }
        s = String.valueOf(sum);
        for(i=0;i<s.length();i++){
            read(s.charAt(i));
            if(i!=s.length()-1){
                System.out.print(" ");
            }
            else{
                System.out.println();
            }
        }
    }
    public static void read(char ch){
    switch(ch){
        case '0':System.out.print("ling");
        break;
        case '1':System.out.print("yi");
        break;
        case '2':System.out.print("er");
            break;
        case '3':System.out.print("san");
            break;
        case '4':System.out.print("si");
            break;
        case '5':System.out.print("wu");
            break;
        case '6':System.out.print("liu");
            break;
        case '7':System.out.print("qi");
            break;
        case '8':System.out.print("ba");
            break;
        case '9':System.out.print("jiu");
            break;
    }
    }
}
