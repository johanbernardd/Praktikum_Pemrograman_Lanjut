public class MainEmployee {
    public static void main(String[] args) {
    Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
    //Manager boss1 = new Manager("Johanes");
    boss.setBonus(5000);

    Employee1 staff = new Employee1("Donni", 50000, 1989, 10,1);
    //Employee staff1 = new Employee("Johanes");
    staff.raiseSalary(10);

    System.out.println("nama boss : " + boss.getName()+", salary = " + boss.getSalary());
    System.out.println("nama staff : " + staff.getName()+", salary = " + staff.getSalary());
    // System.out.println("nama boss1 : " + boss1.getName()+", salary = " + boss1.getSalary());
    // System.out.println("nama staff1 : " + staff1.getName()+", salary = " + staff1.getSalary());
    }
}