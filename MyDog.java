package com.syntaxclass12;

public class MyDog {
	String name;
	String breed;
	String color;
	int age;
	char gender;
	
	void bark() {
		System.out.println(name+ " loves to bark");
	}
	void cuddle() {
		System.out.println(name+" loves to cuddle sometimes");
	}
	void run() {
		System.out.println(name+" too lazy to run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDog dog1=new MyDog();
		dog1.name="Bruno";
		dog1.breed="Husky";
		dog1.color="white";
		dog1.age=2;
		dog1.gender='F';
		dog1.bark();
		dog1.cuddle();
		dog1.run();
		
		MyDog dog2=new MyDog();
		dog2.name="Hugo";
		dog2.breed="Bulldog";
		dog2.color="black";
		dog2.age=1;
		dog2.gender='M';
		dog2.bark();
		dog2.cuddle();
		dog2.run();
		
		MyDog dog3=new MyDog();
		dog3.name="Mo";
		dog3.breed="Labrador";
		dog3.color="Chocolate";
		dog3.age=4;
		dog3.gender='F';
		dog3.bark();
		dog3.cuddle();
		dog3.run();
		

	}

}
