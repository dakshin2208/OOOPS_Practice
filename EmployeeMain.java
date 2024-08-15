package Teams.day6;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        EmployeeInformation emp1 = new EmployeeInformation();

        String name = in.nextLine();

        emp1.setName(name);

        int salary = in.nextInt();

        emp1.setSaLaRy(salary);

        emp1.getName();
        emp1.getsalary();
    }
}
