import java.util.*;

class LoopsCode4{

    void patternByForLoop(){
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print("$");
            }
            System.out.print("\n");
        }
    }

    void seriesByWhile(){
        int num=0;
        while(num<=50){
            System.out.print(num + " ");
            num+=5; // num=num=num+5
        }
    }

    void seriesByDoWhile(){
        int num2=10;
        do{
            System.out.print(" "+num2);
            num2-=2;
        }while(num2>=0);
    }
    //}

    //class LoopControl{

    public static void main(){
        
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print('\f');
        LoopsCode4 ob = new LoopsCode4();
        
        do{

            System.out.print("\n\nMenu: \n\n 1. Pattern using for loop \n 2. Series using while loop \n 3. Series using do..while loop \n 55. Exit \n Enter choice: ");
            
            ch = sc.nextInt();
            System.out.print('\f');
            
            switch (ch){
                case 1: 
                    ob.patternByForLoop();
                    break;
                case 2: 
                    ob.seriesByWhile();
                    break;
                case 3: 
                    ob.seriesByDoWhile();
                    break;
                case 55: 
                    System.out.print("Exiting the program\n");
                    break;
                default: 
                    System.out.println("Wrong choice, enter 1,2,3 or press 55 to exit");
            }

        } while(ch != 55);

        System.out.println("\nEnd of program");
    }
}//