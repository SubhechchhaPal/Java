import java.util.*; 
class Overriding{
public static void main(){
    Rectangle obj=new Rectangle();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first side : ");
    obj.a=sc.nextInt();
    //int res
    obj.area(obj.a);
    //System.out.println("Area of sqauar is " +res);
}
}
class Area{
    int a;
//Area(){
//a=b=0;
//}
void area(int a){
    int cal=a+a;
    System.out.println("area of squar is "+ cal);
}
}
class Rectangle extends Area{
    int a=super.a;
    //int b=super.b;
void area(int a){
int rect=2*(a*a);
 System.out.println("area of rectangel is "+ rect);
 super.area(a);
 //public void area();
}
}