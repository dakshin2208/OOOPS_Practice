package Teams.day6;

import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        StudentGrade dakshin = new StudentGrade();

        if(n > 0 && n <= 100){
            dakshin.setGrade(n);
        }

        dakshin.getgrade();
    }
}
