package Teams.day5;

import java.util.Scanner;

public class OperationMain {
    public static void main(String[] args) {

         Calculator ob = new Calculator();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("enter number 1:");
            int num1 = in.nextInt();

            System.out.println("enter number 2:");
            int num2 = in.nextInt();

            System.out.println("what operation to perform:");
            char operation = in.next().trim().charAt(0);

             double result = ob.operation(num1,num2,operation);

             if(!Double.isNaN(result)){
                 System.out.println("Result :" + result);
             }
             in.nextLine();

            System.out.println("if you want to continue:");
             String wish = in.nextLine();

            if(wish.equals("no")){
                break;
            }
        }
    }
}
