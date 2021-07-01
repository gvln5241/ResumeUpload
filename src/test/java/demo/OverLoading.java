package demo;


class A{
	static int a;
	static{
		System.out.println("this is from static");
	}
	public static  void add() {
		System.out.println("from Parent");
	}
}
class B extends A{
	public static void add() {
		
		System.out.println("from Child");
	}
}
public class OverLoading {
public static void main(String a1[])
{
	A prnt=new A();
//	B ch=new B();
//
//	prnt.add();
//	ch.add();
//	A a=new B();
//	a.add();
	
	
}
}