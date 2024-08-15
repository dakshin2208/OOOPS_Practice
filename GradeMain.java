package Teams.day5;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = in.nextLine();
        System.out.println("enter the homework grade:");
        int home = in.nextInt();
        System.out.println("enter the final exam mark :");
        int exam = in.nextInt();

        Grade obj = new Grade(name , home , exam);

        obj.display();

    }
}
