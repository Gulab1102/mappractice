package org.example;

import java.util.*;

import org.example.model.Employee;

public class Main {
	
	
    public static void main(String[] args) {

     // Employee employee=new Employee();
      
      List<Employee> emloyeelist=new ArrayList<Employee>();
      
      Employee e1=new Employee(4,"Gulab","ADMIN");

      Employee e2=new Employee(4,"Priya","ADMIN");
      
      emloyeelist.add(new Employee(4,"Gulab","ADMIN"));
      
      emloyeelist.add(new Employee(5,"Priya","ADMIN"));
      emloyeelist.add(new Employee(2,"Nandani","ADMIN"));


        IdComparator idComparator=new IdComparator();
        Collections.sort(emloyeelist,idComparator);
       // System.out.println(emloyeelist);


        Map<String,Integer> map=new HashMap<>();

        map.put("Priya",4);
        map.put("Gulab",2);
        map.put("Nandani",6);
        map.forEach((k,v)->{
            System.out.println(v);
        });

        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> nxt=iterator.next();
            if(nxt.getKey().equals("Gulab"))iterator.remove();
        }

        System.out.println(map);


      


    }
}