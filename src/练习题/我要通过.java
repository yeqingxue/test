package 练习题;
import java.util.Scanner;
public class 我要通过 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] p = new String[10];
        int n = input.nextInt();
        int i;
        for(i=0;i<n;i++){
            p[i] = input.next();
        }
        for(i=0;i<n;i++){
            judge(p[i]);
        }
    }
    public static  void judge(String p){
        int count1 = 0 ,count2 = 0,count3 = 0;
        int n;
        n=p.length();
        int i;
        int sum=0;
        int x=0,y=0,z=0;
        for(i=0;i<n;i++){
            if(p.charAt(i)=='A'){
                sum++;
                z++;
            }
            else if(p.charAt(i)==' '){
                sum++;
                z++;
            }
            else if(p.charAt(i)=='P'){
                count1 = sum;
                sum = 0;
                x++;
            }
            else if(p.charAt(i)=='T'){
                if(x==0){
                    System.out.println("NO");
                    return;
                }
                else{
                    count2 = sum;
                    sum = 0;
                    y++;
                }
            }
            else{
                System.out.println("NO");
                return;
            }
            count3 = sum;
        }
        if(count3 == count1*count2&&(x+y)==2&&z!=0){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println("NO");
            return;
        }
    }
}
