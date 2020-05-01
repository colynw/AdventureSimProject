public class CareTaker	{

	private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m)	{

		mementos.set(0,m);

	}
	
	public Memento getMemento()	{
	
		return mementos.get(0);

	}
}
