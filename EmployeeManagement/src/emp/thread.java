package emp;
class MyThread extends Thread
{
public void run() {
	// TODO Auto-generated method stub
super.run();
for(int i=0;i<=10;i++)
{
	System.out.println(i);
}
}
}
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t1=new MyThread();
t1.start();
	}
		
	}

