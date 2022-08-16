package ArrayConcept1;

import java.util.ArrayList;

public class Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("AJAY");
		al.add('A');
		al.add(12.12f);
		al.add(123);
		al.add("AJAY");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.contains("AJAY"));
		System.out.println(al.remove(0));
		System.err.println(al);
	}

}
