import java.util.*;
class NonDriver{
public static void main(){
Nonrepeat obj=new Nonrepeat();
obj.setter();
int res=obj.non(obj.num);
System.out.println("There is " +res+ " non-repetative number in " + obj.num );
}
}
class Nonrepeat{
    int num;
Nonrepeat(){
num=0;
}
int non(int num){
    int i,r,f=0;
    int arr[]=new int[10];
    while(num!=0){
       r=num%10;
       arr[r]=arr[r]+1;
       num=num/10;
    }
    for(i=0;i<10;i++){
        if(arr[i]==1){
            f=f+1;
        }
    }
    return f;
}
void setter(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num =sc.nextInt();
}
}