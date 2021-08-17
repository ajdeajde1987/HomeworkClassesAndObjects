package com.syntaxclass12;

public class Phone {
	String name;
	String model;
	String color;
	
	void capture_video () {
		System.out.println(name+" can capture video");
	}
	void live_video() {
		System.out.println(name+ " can do live video ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone phone1=new Phone();
		phone1.name="Iphone";
		phone1.model="12 pro";
		phone1.color="blue";
		phone1.capture_video();
		phone1.live_video();
		
		Phone phone2=new Phone();
		phone2.name="Android";
		phone2.model="note12";
		phone2.color="silver";
		phone2.capture_video();
		phone2.live_video();
		
		Phone phone3=new Phone();
		phone3.name="Nokia";
		phone3.model="13-10";
		phone3.color="black";
		phone3.capture_video();
		phone3.live_video();
		
		
			
		}

	}


