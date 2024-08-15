package Teams.day5;

public class Grade {
    String name;
    double homework;
    double exam;

    public Grade(String name , int homework , int exam){
        this.name = name;
        this.homework =homework;
        this.exam = exam;
    }

    public void display(){
        System.out.println("Name :" + name);
        System.out.println("Home work grade:"+ homework);
        System.out.println("final exam grade:" + exam);
        System.out.println("Avarage grade:" + (homework + exam ) / 2);
    }
}
