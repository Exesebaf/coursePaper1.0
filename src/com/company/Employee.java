package com.company;

public class Employee {
    private String fio;
    private int department;
    private double salaryEmployee;
    private static int counter;
    private int id;

    public Employee(String fio, int department, double salaryEmployee) {
        if (department>5|| department <0 ) throw new  IllegalArgumentException("Введено недопустимое значение.");
        this.fio = fio;
        this.department = department;
        this.salaryEmployee = salaryEmployee;
        this.id = ++counter;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int department) {
        if (department>5|| department <0 ) throw new  IllegalArgumentException("Введено недопустимое значение.");
        this.department = department;
    }

    public void setSalaryEmployee(double salary) {
        this.salaryEmployee = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", депертамент " + department + ", salaryEmployee " + salaryEmployee + ", id " + id;
    }
}
