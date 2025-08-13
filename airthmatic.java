import java.util.Scanner;
 public class airthmatic{
    public static void main(String[] args){
        Scanner learn=new Scanner(System.in);
        System.out.println("enter first number here");
        double a=learn.nextDouble();
        System.out.println("enter second number here");
        double b=learn.nextDouble();
        double c=a%b;
        double d=a+b;
        double e=a-b;
        double f=a*b;
        double g=a/b;

        System.out.println("the remainder is:"+c);
        System.out.println("the sum of the two numbers is:"+d);
        System.out.println("the difference between two numbers is:"+e);
        System.out.println("the product of two numbers is:"+f);
        System.out.println("the division result is:"+g);
        
        

    }
}