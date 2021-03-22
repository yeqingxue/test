package 练习题;
import java.util.Scanner;
public class 成绩排名 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student[] stu = new Student[1000];
        int n = input.nextInt();
        int i,j;
        int min=0,max=0,x,y;
        for(i=0;i<n;i++){
            stu[i] = new Student();
            stu[i].name = input.next();
            stu[i].stuno = input.next();
            stu[i].grade = input.nextInt();
        }
        x=stu[0].grade;
        y=stu[0].grade;
        for(i=1;i<n;i++){
            if(stu[i].grade>x){
                max = i;
                x = stu[i].grade;
            }
            if(stu[i].grade<y){
                min = i;
                y = stu[i].grade;
            }
        }
        System.out.println(stu[max].name+" "+stu[max].stuno);
        System.out.println(stu[min].name+" "+stu[min].stuno);
    }
}
class Student{
    String name;
    String stuno;
    int grade;
}
