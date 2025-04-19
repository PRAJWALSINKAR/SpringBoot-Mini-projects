package prajwal.in.employee;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pract_tbl")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
private String ename;
private Double esalary;

@Column(updatable = false)
@CreationTimestamp
private LocalDate createdDate;

@Column(insertable = false)
@UpdateTimestamp
private LocalDate updatedDate;
          
public LocalDate getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(LocalDate updatedDate) {
	this.updatedDate = updatedDate;
}

public Employee() {};

public Employee( String name , Double salary) {
	
	this.ename = name ;
	this.esalary = salary;
    }

public Integer getEid() {
	return eid;
}
public String getName() {
	return  ename;
}

public void setName(String name) {
	this.ename = name;
}

public double getSalary() {
	return esalary;
}

public void setSalary(Double salary) {
	this.esalary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + eid + ", name=" + ename + ", salary=" + esalary + "]";
}

}
