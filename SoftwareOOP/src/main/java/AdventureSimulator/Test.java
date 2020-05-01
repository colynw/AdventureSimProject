package AdventureSimulator;
import java.util.ArrayList;



public class Test {

	private ArrayList<Integer> test = new ArrayList<>();
		

	public void setArr()	{
		
		test.add(0);
	}

	public void addArr()	{
		
		test.set(0,9849284);
	}

	public void getElem()	{
		
		System.out.printf("%d",test.get(0));
	}

	public static void main(String args[])	{
		
		Test t = null;

		t = new Test();

		t.setArr();

		t.addArr();
		
		t.getElem();

		//
	}
}

