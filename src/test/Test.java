package test;

import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		A a=new A();
		B b=new B();
		A c=new B();
		System.out.println(a.getClass().getSimpleName());
		System.out.println(b.getClass().getSimpleName());
		System.out.println(c.getClass().getSimpleName());
	}
	
	static class A{
		
	}
	
	static class B extends A{
		
	}
}
