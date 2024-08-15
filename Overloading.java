import java.util.*;
class Overloading{
    int a,b,c,res;
Overloading(){
    a=b=c=res=0;
}
    int sum(int a,int b){
         res=a+b;
        return res;
    }
    int sum(int a,int b,int c){
         res=(a+b)*c;
        return res;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter second number: ");
        int num3=sc.nextInt();
        Overloading obj=new Overloading();
    System.out.println("Sum of "+num1+" and "+num2+" is "+ obj.sum(num1,num2));
    System.out.println("Sum of "+num1+" and "+num2+" is "+ obj.sum(num1,num2,num3));
    }
}