package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class ExceptionTest
{



	public static void main(String[] args) {
		try {
			int c=1/0;
			System.out.println(c);
		}
		catch(ArithmeticException e) {

		}
		finally {
			System.out.println("finally");
		}
		System.out.println("code is executed properly");

	}


}
