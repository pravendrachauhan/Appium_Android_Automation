package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
	public static void main(String[] args) {
		//1,2,3,4,5,6,7,..10
		List<Integer> list=new ArrayList<Integer>();
		for(int value=1;value<=10;value++) {
			list.add(value);
		}
		
//		for(int index=0;index<10;index++) {
//			System.out.println(list.get(index));
//		}
		
		for(int temp : list) {
			System.out.println(temp);
		}
		
	}
	
	
}
