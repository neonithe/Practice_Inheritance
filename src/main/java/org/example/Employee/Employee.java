package org.example.Employee;

public abstract class Employee {

    private int id;
    private String name;
    private double salary;
    private int dateHired;

    public Employee(int id, String name, double salary, int dateHired) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        setDateHired(dateHired = dateHired);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDateHired() {
        return dateHired;
    }

    public void setDateHired(int dateHired) {
        this.dateHired = dateHired;
    }

    public abstract void calc();

    public String toString(){
        return "Id: " + id + " | Name: " + name + " | Salary: " + salary;
    }


}
