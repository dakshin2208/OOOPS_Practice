package Teams.day6;

public class EmployeeInformation {
    private String name ;

    private double saLaRy;


    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("the name should be :" + name);
    }
    public void setSaLaRy(double saLaRy){
        if(saLaRy < 0){
            System.out.println("Error");
        }else{
            this.saLaRy = saLaRy;
        }
    }

    public void getsalary(){
        System.out.println("the salary = " + saLaRy);
    }
}
