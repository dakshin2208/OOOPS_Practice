package Teams.day5;

public class Salary {
    String name;
    int id;
    int basicsalary;
    int allowance;

    //default constructor
    Salary(){
        name = null;
        id = 0;
        basicsalary =0;
        allowance =0;
    }
    //paraMaterialized constructor;

    Salary(String name , int id ,int basicsalary ,int allowance){
        this.name = name;
        this.id =id;
        this.basicsalary = basicsalary;
        this.allowance =allowance;
    }

    double total(){
        return basicsalary+allowance;
    }

    void print(){
        System.out.println("employee id:" + id);
        System.out.println("employee name :" + name);
        System.out.println("basic salary :" + basicsalary);
        System.out.println("allowance :" + allowance);
        System.out.println("gross salary :" + total());
    }
}
