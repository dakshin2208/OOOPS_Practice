package Teams.day5;


import java.util.Scanner;

public class SalaryMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the no of employee:");
        int n = in.nextInt();

        Salary [] em = new Salary[n];

        for (int i = 0; i < em.length; i++) {

            System.out.println("enter the employee details of "+ i+1 + ":");
            System.out.println("enter the name :");
            String name = in.next();

            System.out.println("enter the employee id:");
            int id = in.nextInt();

            System.out.println("enter the salary : ");
            int salary = in.nextInt();

            System.out.println("enter the allowance :");
            int allow = in.nextInt();

            em[i] = new Salary(name, id ,salary ,allow);
        }

        System.out.println("Employes detail:");
        for (Salary j : em){
            j.print();
            System.out.println();
        }
    }
}
