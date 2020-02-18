package stringmethods;

import javax.imageio.IIOException;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		try {
		System.out.println(a/b);
		throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally always execute");
		}
		System.out.println("my prgm is executed");

	}

}
