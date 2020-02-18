package emp;
class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends  A{
	B()
	{
     System.out.println("B()");
}
}

public class Superconstructor {
	public static void main(String ar[]) {
	//A a=new A();
	B b=new B();
	}
}
