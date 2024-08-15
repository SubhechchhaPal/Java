import java.util.*; 
class AreaTestDeiver{
public static void main(){
    Squar obj=new Squar();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first side of the squar: ");
    obj.a=sc.nextInt();
    System.out.print("Enter second side of the squar: ");
    obj.b=sc.nextInt();
    int res=obj.areacal(obj.a,obj.b);
    System.out.println("Area of sqauar is " +res);
}
}
class Area{
    int a,b;
//Area(){
//a=b=0;
//}
}
class Squar extends Area{
    int a=super.a;
    int b=super.b;
int areacal(int a,int b){
int cal=(a*b);
return cal;
}
}