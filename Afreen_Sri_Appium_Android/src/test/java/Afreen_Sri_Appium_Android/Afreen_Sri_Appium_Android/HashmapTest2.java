package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapTest2
{



	public static void main(String[] args) {
		Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
		map.put(1, Arrays.asList("pravendra","canada"));
		map.put(2, Arrays.asList("Afreen","UK"));
		map.put(3, Arrays.asList("Sri","London"));
		
		System.out.println(map.get(2));
		
	}


}
