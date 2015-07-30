package test;

import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<String> l1=new LinkedList<String>();
		List<String> l2=new LinkedList<String>();
		l1.add("ABC");
		l1.add("CBA");
		l2=l1;
		l1.clear();
		System.out.println(l1);
	}
}
