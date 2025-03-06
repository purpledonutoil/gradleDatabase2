package org.example;

public class FindMaxSalaryWorker {
    String name;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;
    }
}
