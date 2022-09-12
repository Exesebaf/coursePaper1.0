package com.company;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Zaxar Sergeyevich Naumov", 2,49000);
        employees[1] = new Employee("Yulia iktorovna Lukyanova", 1,39885);
        employees[2] = new Employee("Yulia Vinokurova Bogdanovna", 3, 30000);
        employees[3] = new Employee("Madonna Titova Makarovna", 4, 75156);
        employees[4] = new Employee("Diana Viktorovna Medvedeva", 5, 45534);
        employees[5] = new Employee("Miron Sergeyevich Fomin", 1, 46225);
        employees[6] = new Employee("Zakhar Petrov Fedorovich", 2, 49535);
        employees[7] = new Employee("Alice Dmitrievna Lukyanova", 3, 85995);
        employees[8] = new Employee("Alice Korotkova Daniilovna", 4, 39656);
        employees[9] = new Employee("Alexandrova Anastasia Kirillovna", 5, 58458);

        printFullEmployee();
        System.out.println(getSumSalaryEmployee());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAvarageSalaryEmployee());
        printFullNameEmployee();
    }

    public static void printFullEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getSumSalaryEmployee() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum = sum + employee.getSalaryEmployee();
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;
        Employee employeeMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] !=null) {
                min = employees[i].getSalaryEmployee();
                employeeMinSalary = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalaryEmployee() < min) {
                min = employees[i].getSalaryEmployee();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }
    public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;
        Employee employeeMaxSalary = null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] !=null) {
                max = employees[i].getSalaryEmployee();
                employeeMaxSalary = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalaryEmployee() > max) {
                max = employees[i].getSalaryEmployee();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }
    public static double getAvarageSalaryEmployee(){
        double sum = 0;
        int countEmp = 0;
        for (Employee emp: employees) {
            if (emp== null) continue;
            countEmp++;
            sum += emp.getSalaryEmployee();
        }
        return  sum/countEmp;
    }
    public static void printFullNameEmployee(){
        for (Employee empl: employees) {
            if(empl == null)continue;
            System.out.println(empl.getFio());
        }
    }
}