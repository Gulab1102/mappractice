package org.example;

import org.example.model.Employee;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getId()-o1.getId();
    }
}
