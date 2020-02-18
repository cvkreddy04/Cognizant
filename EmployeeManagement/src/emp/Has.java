package emp;
class engine
{

	int engineNo,age;
	String fueltype;
	@Override
	public String toString() {
		return "engine [engineNo=" + engineNo + ", age=" + age + ", fueltype=" + fueltype + "]";
	}
	public engine(int engineNo, int age, String fueltype) {
		super();
		this.engineNo = engineNo;
		this.age = age;
		this.fueltype = fueltype;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
}
class Motorcar
{
	engine engine;
	int carNo;
	String carmodel;
	@Override
	public String toString() {
		return "Motorcar [engine=" + engine + ", carNo=" + carNo + ", carmodel=" + carmodel + "]";
	}

	public Motorcar(engine engine, int carNo, String carmodel) {
		super();
		this.engine = engine;
		this.carNo = carNo;
		this.carmodel = carmodel;
	}

	public engine getEngine() {
		return engine;
	}
	public void setEngine(engine engine) {
		this.engine = engine;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
}
	public class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorcar m=new Motorcar(new engine(111,8,"petrol"),2222,"Tuv300");
		System.out.println(m);

	}

}

