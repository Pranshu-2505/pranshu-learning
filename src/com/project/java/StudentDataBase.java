package com.project.java;

public class StudentDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student("Pran","12345678");
		stu.setPhone("80562****");
		stu.getPhone();
		stu.setCity("chennai");
		stu.getCity();
		stu.setState("Tamil Nadu");
		stu.getState();
		stu.enroll("english");
		stu.enroll("maths");
		stu.showCourses();
		stu.showbalance();
		stu.payBalance(1000);
		stu.showbalance();
		
		

	}

}

class Student {
	private String name;
	private static int ID = 1000;
	private String User_ID;
	private String Email;
	private String SSN;
	private String Courses="";
	private final double CourseFee=660;
	private double balance=0;
	private String phone;
	private String state;
	private String city;
	
	
	public Student(String name,String SSN){
		ID++;
		this.name=name;
		this.SSN=SSN;
		System.out.println("Welcome "+name);
		SetUserId();
		setUserEmail();
		
	}
	
	
	private void SetUserId(){
		
		int random = (int) ((Math.random()+1)*1000);		
		User_ID = ID + "" + random + SSN.substring(SSN.length()-4, SSN.length());
		System.out.println("Your user ID : " +User_ID);
	}
	
	private void setUserEmail(){
		Email = name + "_" +User_ID +"@student.com";
		System.out.println("Your Email ID : " +Email);
	}
	public void enroll(String Course){
		 this.Courses =  this.Courses + "\n" +Course;
		balance=balance+CourseFee;
	}
	
	public void showCourses(){
	
		System.out.println("You have enrolled for courses " +Courses);
	}
	
	public void showbalance(){
		System.out.println("Your total balnce is " +balance);
	}
	
	public void payBalance(double amount){
		System.out.println("Amount paid "+amount);
		balance=balance-amount;
	}


	public String getPhone() {
		System.out.println("Your phone number is : " +phone);
		return phone;
		
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getState() {
		System.out.println("Your state is : "+state);
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		System.out.println("Your city is : " +city);
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

}
