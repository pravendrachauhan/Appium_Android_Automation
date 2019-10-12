package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class OverloadingTest {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static float sum(int a,float b) {
		return a+b;
	}
	
	public static float sum(long a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(1,2));
		System.out.println(sum(1,2.3f));
		System.out.println(sum(1654565654654665L,2.3f));
	}

}
