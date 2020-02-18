package emp;

class Car1{
	int carsNumber;
	int run()
	{
		return 60;
	}
}
class Fordcar extends Car1
{
	int run()
	{
		return super.run()+40;
	}
}
public class Car{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fordcar f=new Fordcar();
		System.out.println(f.run());

	}

}
