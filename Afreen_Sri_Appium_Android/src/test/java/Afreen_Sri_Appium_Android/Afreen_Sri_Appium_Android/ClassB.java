package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

public class ClassB extends ClassA{
	
	public void show() {
		super.show();
		System.out.println("in ClassB");
	}

	public static void main(String[] args) {
		ClassA aObj=new ClassB();
		//ClassB bObj=new ClassB();
		//ClassA aObj=new ClassA();
		aObj.show();
	}

}
