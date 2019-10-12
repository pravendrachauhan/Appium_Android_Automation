package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class StringTest
{
	public static void main(String[] args) {
		
		String str1="token # number #1234567";
//		String[] strArray = str1.split("#");
		
		System.out.println(str1.split("#")[1]);
		System.out.println(str1.charAt(6));
		System.out.println(str1.substring(7,10));
		String str2="token number #1234567";
		System.out.println(str2.replace("token number #", ""));
		System.out.println("hello"+str2);
		System.out.println("hello".concat(str2));
		System.out.println(str2.endsWith("23"));
		String str3="    hello my name is pravendra     ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
	}
	
	
}
