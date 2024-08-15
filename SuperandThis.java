import java.util.*; 
class SuperandThis{
public static void main(){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a number : ");
 int num=sc.nextInt();
 Area obj=new Area();
 obj.areacal(num);
 System.out.print("Enter a number : ");
 int n=sc.nextInt();
 Squar obj1=new Squar();
 System.out.println("Area of squar"+ obj1.squarcal());
}
}
class Area{
    int a;
void areacal(int a){
int cal=3*a*a;
System.out.println("Area of circle is " +cal);
}
}
class Squar extends Area{
    //int s;
    int s=super.a;
    int squarcal(){
    int result=s*s;
    return result;
} 
}

/*class Squar extends Area{
    int a=super.a;
int squarcal(int a){
int cal=(a*a);
return cal;
}
}*/