package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class ConstructorTest
{
	int rollNo;
	String name;
	
	public ConstructorTest(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void main(String[] args) {
		ConstructorTest student1= new ConstructorTest(123,"Pravendra");
		System.out.println(student1.rollNo);
		System.out.println(student1.name);
		ConstructorTest student2= new ConstructorTest(234,"Afreen");
		System.out.println(student2.rollNo);
		System.out.println(student2.name);
		ConstructorTest student3= new ConstructorTest(345,"Sri");
		System.out.println(student3.rollNo);
		System.out.println(student3.name);
		
	}
	
	
}
