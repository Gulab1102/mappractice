package org.example.model;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    String role;
	@Override
	public int hashCode() {
		return Objects.hash(id, name, role);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(role, other.role);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(int id, String name, String role) {
		//super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public Employee() {
		
	}
	
	
	
	@Override
	public int compareTo(Employee e) {
	    
		return this.id-e.id;
	}
	
    
	
    

}
