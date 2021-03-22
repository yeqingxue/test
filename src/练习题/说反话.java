package 练习题;
import java.util.Scanner;
public class 说反话 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String();
        str = input.nextLine();
        String[] str1 = new String[100];
        str1 = str.split(" ");
        for(int i = (str1.length-1);i>=0;i--){
            if(i!=0){
                System.out.print(str1[i]+" ");
            }else {
                System.out.println(str1[i]);
            }
        }
    }
}
