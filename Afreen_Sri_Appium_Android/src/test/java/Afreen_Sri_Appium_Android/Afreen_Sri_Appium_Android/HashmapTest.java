package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest
{



	public static void main(String[] args) {
		//1:pravendra
		//2:Afreen
		//3:Sri
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "pravendra");
		map.put(2, "Afreen");
		map.put(3, "Sri");
		
		System.out.println(map);
		System.out.println(map.get(2));
		
	}


}
