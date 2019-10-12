package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class SampleTest2
{
	
	static int count=1;
	int value=1;
	public void increaseCount() {
		count=count+1;
		System.out.println(count);
	}
	
	public void increaseValue() {
		value=value+1;
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		SampleTest2 sample=new SampleTest2();
		sample.increaseCount();
		sample.increaseValue();
		SampleTest2 sample2=new SampleTest2();
		sample2.increaseCount();
		sample2.increaseValue();
		SampleTest2 sample3=new SampleTest2();
		sample3.increaseCount();
		sample3.increaseValue();

		
	}
	
	
}
