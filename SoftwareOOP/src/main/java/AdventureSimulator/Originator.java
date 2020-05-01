package AdventureSimulator;

public class Originator	{
	
		private int hp;

		private int xp;


	public void setState(int myhp,int myxp)	{
		
		this.hp = myhp;

		this.xp = myxp;

	}


	public Memento save()	{
		
		int savedhp = this.hp;

		int savedxp = this.xp;
	
		return new Memento(savedhp,savedxp);	
	}

	public int restoreHP()	{
		
		return this.hp;

	}

	public int restoreXP()	{
		
		return this.xp;

	}

}
