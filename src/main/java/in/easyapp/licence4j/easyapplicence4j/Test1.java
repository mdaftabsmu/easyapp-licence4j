package in.easyapp.licence4j.easyapplicence4j;

import java.util.HashMap;
import java.util.Map;

import in.easyapp.licence4j.easyapplicence4j.controller.Parent;

public class Test1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.prinit();
		
		String str1 ="AAA";
		
		String str2 = new String("AAA");
		
		System.out.println(str1==str2);
		str2 = str2.intern();
		
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		
		Student st1 = new Student("Aftab", "Alam");
		
		Map<Long,Student> map = new HashMap<Long,Student>();
		
		map.put(1L, st1);
		
		Student st2 = map.get(1L);
		
		st2.setFirstName("Yasmin");
		
		System.out.println(st1.getFirstName());
		System.out.println(st2.getFirstName());
		
	}

}
