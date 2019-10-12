package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class SampleTest
{
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void minus(int a,int b) {
		System.out.println(a-b);
	}
	
	
	
	public static void main(String[] args) {
		SampleTest sample=new SampleTest();
		sample.add(1, 2);
		
		SampleTest.minus(4,1);
	}
	
	
}
