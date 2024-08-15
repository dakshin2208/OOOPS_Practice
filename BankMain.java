package Teams.day6;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BankAccount dakshin = new BankAccount();

        dakshin.setPin(1977);
             while(true){
                 System.out.println("hello dakshin:");
                 System.out.println("Enter your pin to continue:");
                 int pin = in.nextInt();
                 if(pin  == dakshin.pin){
                     System.out.println("welcome dakshin ");
                     System.out.println("1 . deposite" );
                     System.out.println("2. withdraw ");
                     System.out.println("3. balance enquire");
                     System.out.println("select options 1 / 2 / 3");

                     int option = in.nextInt();

                     switch (option){
                         case 1:
                             System.out.println("enter how much you like to deposite:");
                             double deposit = in.nextDouble();
                             dakshin.deposite(deposit);
                             System.out.println("Rs" + deposit + "Successfully deposited ");
                             dakshin.balance();
                             break;

                         case 2:
                             System.out.println("enter how much you like to witdraw :");
                             double withdraw = in.nextDouble();
                             dakshin.withdraw(withdraw);
                             System.out.println("Rs" + withdraw +"withdrawn successfully");
                             dakshin.balance();
                             break;

                         case 3:
                             System.out.println("the Available balance :");
                             dakshin.balance();
                             break;
                         default:
                             System.out.println("enter correct option");
                             break;

                     }
                 }else{
                     System.out.println("ERROR ! you entered wrong password");
                     break;
                 }
             }
        }


    }

