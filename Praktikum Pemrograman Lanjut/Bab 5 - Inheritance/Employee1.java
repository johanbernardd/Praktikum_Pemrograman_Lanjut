import java.util.*;
public class Employee1 {
    private String name;
    private double salary;
    private Date hireday;
    
    public Employee1(String name, double salary, int year,int month, int day){
        this.name = name;
        this.salary = salary;
    GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.hireday = calendar.getTime();
    }
    public Employee1(String name) {
        this.name = name;
    }
    protected Date getHireDay(){
        return hireday;
    }
    protected String getName(){
        return name;
    }
    protected double getSalary(){
        return salary;
    }
    protected void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}