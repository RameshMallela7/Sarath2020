package com.example.test.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploeeTest {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee(1, "sarath"));
        l.add(new Employee(2, "asha"));
        l.add(new Employee(4, "lekhya"));
        l.add(new Employee(3, "lohit"));

        System.out.println("Print list : " + l);
        Collections.sort(l, (e1, e2) -> e1.id < e2.id ? -1 : e1.id > e2.id ? +1 : 0);
        System.out.println("Print list after sort: " + l);

    }
}

class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}