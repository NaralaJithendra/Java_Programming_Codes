package com.examples.java.collections;
public class Student{  
	int rollNo;  
	String name;  
	int age; 
	public Student() {
		
	}
	
	public Student(int rollNo,String name,int age){  
		this.rollNo=rollNo;  
		this.name=name;  
		this.age=age;  
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	} 
	
	
}  