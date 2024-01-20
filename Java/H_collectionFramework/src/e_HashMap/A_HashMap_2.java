package e_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A_HashMap_2 {
	
	public static void main(String[] args) {
		
		String[] names = {"È«±æµ¿", "Àå±æ»ê", "ÀÓ²©Á¤"};
		int[] nums = {1234, 4567, 9874};
		
		Map map = new HashMap();
		for(int i=0; i<3; i++) {
			map.put(names[i],  nums[i]);
		}
		System.out.println("map: " + map);
		
		Set entryS = map.entrySet();
		for(Object obj : entryS) {
			Map.Entry m = (Map.Entry) obj;
			
			System.out.println("key : " + m.getKey() + " value: " + m.getValue());		
		}
		
	}

}
