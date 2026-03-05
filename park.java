class Employee{
    float salary;
    String name;
    int empId;
    
}
class Programmer extends Employee{
    int bonus;
    
}
class Manager extends Employee{
    int incentives;
    
}
public class park{
    public static void main(String[] args){
    Programmer p1=new Programmer();
    Manager m1=new Manager();
    p1.salary=50000;
    p1.name="Changhun-Oh";
    p1.empId=1;
    p1.bonus=10000;
    m1.salary=60000;
    m1.name="Lee Jae-sung";
    m1.empId=2;
    m1.incentives=20000;
    System.out.println("Programmer Salary: "+p1.salary);
    System.out.println("Programmer Name: "+p1.name);
    System.out.println("Programmer EmpId: "+p1.empId);
    System.out.println("Programmer Bonus: "+p1.bonus);
    System.out.println("Manager Salary: "+m1.salary);
    System.out.println("Manager Name: "+m1.name);
    System.out.println("Manager EmpId: "+m1.empId);
    System.out.println("Manager Incentives: "+m1.incentives);
    }
}