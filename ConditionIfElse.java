import java.util.*;
class ConditionIfElseCode3{
    
    boolean checkEven(int a){
        
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }

   
    
    int maxOfThreeNumbers(int a,int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("\f");
        
        ConditionIfElseCode3 ob= new ConditionIfElseCode3();
        
        System.out.println("Enter a Number:");
        int number= scanner.nextInt();
        
        if(ob.checkEven(number)){
            System.out.println("Even no.");
        }
        else { System.out.println("Odd no.");
        }
        
        System.out.println("Enter 3 Numbers:");
        int firstNumber= scanner.nextInt();
        int secondNumber= scanner.nextInt();
        int thirdNumber= scanner.nextInt();
        
        int maximumNumber=ob.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        System.out.println("maximum= "+ maximumNumber);
    }
}