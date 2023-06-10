package TugasPolymorphism;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135",LocalDate.of(1997, 05, 19), 10, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(1997, 04, 20), 15, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", LocalDate.of(1997, 05, 21), 12, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", LocalDate.of(1997, 06, 22), 11, 5000, .04, 300);
    // System.out.println("Employees diproses secara terpisah:\n");
    // System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
    // System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
    // System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
    // System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

    // Employee[] employees = new Employee[4];
    //     employees[0] = salariedEmployee;
    //     employees[1] = hourlyEmployee;
    //     employees[2] = commissionEmployee;
    //     employees[3] = basePlusCommissionEmployee;
    // System.out.println("Employees diproses secara polimorfisme:\n");
    // for (Employee currentEmployee : employees) {
    //     System.out.println(currentEmployee);
    //     if (currentEmployee instanceof BasePlusCommissionEmployee) {
    //         BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
    //         employee.setBaseSalary(1.10 * employee.getBaseSalary());
    //         System.out.printf("Gaji pokok setelah dinaikkan 11%% : $%,.2f\n", employee.getBaseSalary());
    //     }
    // System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
    // }  
    // for (int j = 0; j < employees.length; j++) {
    //     System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
    // }

    Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
    System.out.println("Employees diproses secara polimorfisme:\n");
    for (Employee currentEmployee : employees) {
        System.out.println(currentEmployee);
        if (currentEmployee instanceof BasePlusCommissionEmployee) {
            BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * employee.getBaseSalary());
            System.out.printf("Gaji pokok setelah dinaikkan 11%% : $%,.2f\n", employee.getBaseSalary());
        }
    //System.out.printf("pendapatan: $%,.2f\n", currentEmployee.earnings());
    double bonus = 100000.0;
    double earningsWithBonus = currentEmployee.gajiUlangTahun(bonus);

    double upahPerProduksi = 70.0;
    double earningWithUpahProduksi = currentEmployee.gajiBasedProduction(upahPerProduksi);

    double totalGaji = earningsWithBonus + earningWithUpahProduksi;
    System.out.printf("pendapatan: $%,.2f\n\n", totalGaji);
    }
    for (int j = 0; j < employees.length; j++) {
        System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
    }
    }
}